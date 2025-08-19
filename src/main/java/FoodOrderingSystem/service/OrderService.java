package FoodOrderingSystem.service;

import FoodOrderingSystem.dto.OrderItemRequest;
import FoodOrderingSystem.dto.PlaceOrderRequest;
import FoodOrderingSystem.dto.PlaceOrderResponse;
import FoodOrderingSystem.model.MenuItem;
import FoodOrderingSystem.model.Order;
import FoodOrderingSystem.model.OrderItem;
import FoodOrderingSystem.model.Restaurant;
import FoodOrderingSystem.repository.OrderRepository;
import FoodOrderingSystem.repository.RestaurantRepository;

import java.util.List;

public class OrderService {

    private final RestaurantRepository restaurantRepository;
    private final OrderRepository orderRepository;
    private int orderIdCounter = 1;

    public PlaceOrderRequest orderRequest;

    public OrderService(RestaurantRepository restaurantRepository, OrderRepository orderRepository) {
        this.restaurantRepository = restaurantRepository;
        this.orderRepository = orderRepository;
    }

    public PlaceOrderResponse placeOrder(PlaceOrderRequest request) {
        // Initialize the order request
        orderRequest = new PlaceOrderRequest();

        // Accept an order request with customerName, address, restaurant, and items
        orderRequest.setCustomerName(request.getCustomerName());
        orderRequest.setAddress(request.getAddress());
        orderRequest.setRestaurant(request.getRestaurant());
        orderRequest.setItems(request.getItems());

        // Validate the restaurant
        Restaurant restaurant = restaurantRepository.getRestaurantByName(request.getRestaurant());
        if (restaurant.getName() == null) {
            return PlaceOrderResponse.failure("Restaurant not found: " + request.getRestaurant());
        }

        // Validate each item
        for (OrderItemRequest itemRequest : request.getItems()) {
            MenuItem menuItem = restaurant.getMenu().stream()
                    .filter(item -> item.getName().equalsIgnoreCase(itemRequest.getItemName()))
                    .findFirst()
                    .orElse(null);

            if (menuItem == null) {
                return PlaceOrderResponse.failure("Item not found in menu: " + itemRequest.getItemName());
            }

            if (!menuItem.isAvailable()) {
                return PlaceOrderResponse.failure("Item '" + itemRequest.getItemName() + "' is currently out of stock.");
            }

            if (itemRequest.getQuantity() < 1) {
                return PlaceOrderResponse.failure("Invalid quantity for item: " + itemRequest.getItemName());
            }
        }

        // Calculate order details
            // Total Amount = sum of (price * quantity) for each item
            // Preparation Time = max(prepTime of all items)
            // Estimated Delivery Time = preparation time + 10 minutes (buffer)
        int totalAmount = 0;
        int maxPrepTime = 0;
        int estimatedDeliveryTimeMinutes = 0;
        for (OrderItemRequest itemRequest : request.getItems()) {
            MenuItem menuItem = restaurant.getMenu().stream()
                    .filter(item -> item.getName().equalsIgnoreCase(itemRequest.getItemName()))
                    .findFirst()
                    .orElse(null);
            if (menuItem != null) {
                totalAmount += menuItem.getPrice() * itemRequest.getQuantity();
                maxPrepTime = Math.max(maxPrepTime, menuItem.getPrepTime());
            }
        }
        estimatedDeliveryTimeMinutes = maxPrepTime + 10; // Adding 10 minutes buffer


        // Save the order
            // Generate a unique orderId (e.g., ORD1234)
            // Save the order with:
                // status: PLACED
                // assignedDeliveryPartner: null (can be assigned later)
        String orderId = "ORD" + String.format("%04d", orderIdCounter++);
        OrderItem[] orderItems = request.getItems().stream()
                .map(item -> new OrderItem(item.getItemName(), item.getQuantity()))
                .toArray(OrderItem[]::new);
        // Create the Order object
        Order order = new Order(orderId, request.getCustomerName(), request.getAddress(), request.getRestaurant(),
                List.of(orderItems), totalAmount, estimatedDeliveryTimeMinutes, "PLACED", null);
        orderRepository.save(order);
        return PlaceOrderResponse.success(orderId, totalAmount, estimatedDeliveryTimeMinutes);
    }

    /* Exercise:
    * Implement the placeOrder method in OrderService
    *
    * The system should accept an order request with the following information:
    * - customerName: Name of the customer
    * - address: Customer's location
    * - restaurant: Name of the restaurant
    * - items: List of item names with quantity
    *
    * Example request:
    * {
    *   "customerName": "John Doe",
    *   "address": "123 Main St",
    *   "restaurant": "Pizza Place",
    *   "items": [
    *     { "itemName": "Margherita Pizza", "quantity": 2 },
    *     { "itemName": "Garlic Bread", "quantity": 1 }
    *   ]
    * }
    *
    * The method should:
    * 1. Validate the restaurant
    * - Does the restaurant exist?
    * - Is it reachable from the customer's location? (optional, assume true for now)
    * 2. Validate each item
    * - Does the item exist in the restaurant's menu?
    * - Is the item in stock?
    * - Is the quantity valid (greater than 0)?
    *
    * If any check fails, return:
    * {
    *   "status": "FAILED",
    *   "message": "Item 'Garlic Bread' is currently out of stock."
    * }
    *
    * 3. Calculate the order details
    * - Total Amount = sum of (price * quantity) for each item
    * - Preparation Time = max(prepTime of all items)
    * - Estimated Delivery Time = preparation time + 10 minutes (buffer)
    *
    * 4. Save the order
    * - Generate a unique orderId (e.g., ORD1234)
    * - Save the order with:
    * -- status: PLACED
    * -- assignedDeliveryPartner: null (can be assigned later)
    *
    * Sample output:
    * {
    *   "orderId": "ORD1234",
    *   "totalAmount": 750,
    *   "estimatedDeliveryTimeMinutes": 30,
    *   "status": "PLACED",
    *   "assignedDeliveryPartner": null
    * }
    *
    * Error scenarios to handle:
    * - Restaurant not found:
    * -- Error messages: "Restaurant not found: {restaurantName}"
    * - Item not found in restaurant's menu:
    * -- Error messages: "Item not found in menu: {itemName}"
    * - Item out of stock:
    * -- Error messages: "Item is out of stock: {itemName}"
    * - Invalid quantity (less than 1 / 0 or negative):
    * -- Error messages: "Invalid quantity for item: {itemName}"
     */

}
