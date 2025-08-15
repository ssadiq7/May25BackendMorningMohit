package FoodOrderingSystem.dto;

public class StockUpdateRequest {
    private String restaurantName;
    private String itemName;

    public StockUpdateRequest() {}

    public StockUpdateRequest(String restaurantName, String itemName) {
        this.restaurantName = restaurantName;
        this.itemName = itemName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
