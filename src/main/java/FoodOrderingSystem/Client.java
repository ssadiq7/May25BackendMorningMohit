package FoodOrderingSystem;

import FoodOrderingSystem.dto.OrderItemRequest;
import FoodOrderingSystem.dto.PlaceOrderRequest;
import FoodOrderingSystem.dto.PlaceOrderResponse;
import FoodOrderingSystem.model.MenuItem;
import FoodOrderingSystem.model.Restaurant;
import FoodOrderingSystem.repository.OrderRepository;
import FoodOrderingSystem.repository.RestaurantRepository;
import FoodOrderingSystem.service.OrderService;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // This is a placeholder for the client code that would interact with the Food Ordering System.
        // You can implement a simple console-based client or a GUI client to test the system.
        System.out.println("Welcome to the Food Ordering System!");
        // Further implementation would go here, such as creating orders, viewing menu, etc.
        // For example, you could create a restaurant, add menu items, and place an order.
        // Example:
        Restaurant restaurant = new Restaurant("1", "Pizza Place", "Downtown", true, new ArrayList<>());
        restaurant.addMenuItem(new MenuItem("Margherita Pizza", 8.99, true, 10));
        RestaurantRepository.getInstance().addRestaurant(restaurant);
        OrderService orderService = new OrderService(RestaurantRepository.getInstance(), OrderRepository.getInstance());

        // Create an order
        PlaceOrderRequest request = new PlaceOrderRequest();
        request.setCustomerName("John Doe");
        request.setAddress("123 Main St");
        request.setRestaurant("Pizza Place");
        request.setItems(List.of(
                new OrderItemRequest("Margherita Pizza", 2)/*,
                new OrderItemRequest("Garlic Bread", 1)*/
        ));

        // Assuming the restaurant and menu items are already set up
        // Place the order
        PlaceOrderResponse response = orderService.placeOrder(request);

        System.out.println("Order placed successfully: " + response.getOrderId());
        System.out.println("Total Amount: $" + response.getTotalAmount());
        System.out.println("Estimated Delivery Time: " + response.getEstimatedDeliveryTimeMinutes() + " minutes");
        System.out.println("Status: " + response.getStatus());
        if (response.getMessage() != null) {
            System.out.println("Message: " + response.getMessage());
        }
        // You can add more functionality to the client, such as viewing orders, updating orders,
        // or canceling orders based on the methods available in the OrderService.
        // This is just a basic example to demonstrate how the client might interact with the system.
        // You can expand this client to include more features like viewing restaurant details,
        // updating menu items, or handling user input for a more interactive experience.
        // Note: Make sure to handle exceptions and edge cases in a real-world application.
        // This client is a simple demonstration and can be extended further based on requirements.
        System.out.println("Thank you for using the Food Ordering System!");
        // You can implement more features like viewing order history, updating user profiles, etc.
        // This client can be run to test the functionality of the Food Ordering System.
        // You can also implement a loop to allow multiple orders or interactions with the system.
        // For example, you could prompt the user for input to place multiple orders or view restaurant
        // details, etc. This is just a starting point for building a more comprehensive client application
        // for the Food Ordering System.
    }
}
