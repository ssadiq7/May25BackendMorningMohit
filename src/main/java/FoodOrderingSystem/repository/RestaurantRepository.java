package FoodOrderingSystem.repository;

import FoodOrderingSystem.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private static final RestaurantRepository instance = new RestaurantRepository();
    private final List<Restaurant> restaurants = new ArrayList<>();

    private RestaurantRepository() {}

    public static RestaurantRepository getInstance() {
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public List<Restaurant> getRestaurantByLocation(String location) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant r : restaurants) {
            if (r.getLocation().equalsIgnoreCase(location)) {
                result.add(r);
            }
        }
        return result;
    }

    public Restaurant getRestaurantByName(String name) {
        for (Restaurant r : restaurants) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null; // Return null if no restaurant found with the given name
    }

    public void clear() {
        restaurants.clear();
    }
}
