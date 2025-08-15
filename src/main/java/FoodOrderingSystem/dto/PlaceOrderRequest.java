package FoodOrderingSystem.dto;

import java.util.List;

public class PlaceOrderRequest {
    private String customerName;
    private String address;
    private String restaurant;
    private List<OrderItemRequest> items;

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getRestaurant() { return restaurant; }
    public void setRestaurant(String restaurant) { this.restaurant = restaurant; }

    public List<OrderItemRequest> getItems() { return items; }
    public void setItems(List<OrderItemRequest> items) { this.items = items; }
}
