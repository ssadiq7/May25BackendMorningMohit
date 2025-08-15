package FoodOrderingSystem.dto;

import FoodOrderingSystem.model.GeoLocation;
import java.util.UUID;

public class AssignPartnerRequest {
    private UUID orderId;
    private String restaurantName;
    private GeoLocation restaurantLocation;

    public AssignPartnerRequest() {}

    public AssignPartnerRequest(UUID orderId, String restaurantName, GeoLocation restaurantLocation) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public GeoLocation getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(GeoLocation restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }
}
