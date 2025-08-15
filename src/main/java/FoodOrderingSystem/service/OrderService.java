package FoodOrderingSystem.service;

import FoodOrderingSystem.dto.OrderItemRequest;
import FoodOrderingSystem.dto.PlaceOrderRequest;
import FoodOrderingSystem.dto.PlaceOrderResponse;
import FoodOrderingSystem.model.OrderItem;
import FoodOrderingSystem.repository.OrderRepository;
import FoodOrderingSystem.repository.RestaurantRepository;

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

        // Paste your code here
        return null;

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
