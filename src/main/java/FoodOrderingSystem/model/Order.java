package FoodOrderingSystem.model;

import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    private String address;
    private String restaurant;
    private List<OrderItem> items;
    private int totalAmount;
    private int estimatedDeliveryTimeMinutes;
    private String status;
    private String assignedDeliveryPartner;

    public Order(String orderId, String customerName, String address, String restaurant, List<OrderItem> items,
                 int totalAmount, int estimatedDeliveryTimeMinutes, String status, String assignedDeliveryPartner) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.address = address;
        this.restaurant = restaurant;
        this.items = items;
        this.totalAmount = totalAmount;
        this.estimatedDeliveryTimeMinutes = estimatedDeliveryTimeMinutes;
        this.status = status;
        this.assignedDeliveryPartner = assignedDeliveryPartner;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getEstimatedDeliveryTimeMinutes() {
        return estimatedDeliveryTimeMinutes;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedDeliveryPartner() {
        return assignedDeliveryPartner;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssignedDeliveryPartner(String assignedDeliveryPartner) {
        this.assignedDeliveryPartner = assignedDeliveryPartner;
    }
}
