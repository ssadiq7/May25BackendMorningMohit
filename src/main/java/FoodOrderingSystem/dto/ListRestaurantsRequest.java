package FoodOrderingSystem.dto;

public class ListRestaurantsRequest {
    private String location;
    private RestaurantFilterRequest filters;

    public ListRestaurantsRequest() {}

    public ListRestaurantsRequest(String location, RestaurantFilterRequest filters) {
        this.location = location;
        this.filters = filters;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public RestaurantFilterRequest getFilters() { return filters; }
    public void setFilters(RestaurantFilterRequest filters) { this.filters = filters; }
}
