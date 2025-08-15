package FoodOrderingSystem.service;

import FoodOrderingSystem.model.MenuItem;
import FoodOrderingSystem.model.Restaurant;
import FoodOrderingSystem.repository.RestaurantRepository;

import java.util.List;

public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public boolean markItemOutOfStock(String restaurantName, String itemName) {
        Restaurant restaurant = restaurantRepository.getRestaurantByName(restaurantName);
        if (restaurant == null) return false;

        List<MenuItem> menu = restaurant.getMenu();
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public boolean restockItem(String restaurantName, String itemName) {
        Restaurant restaurant = restaurantRepository.getRestaurantByName(restaurantName);
        if (restaurant == null) return false;

        List<MenuItem> menu = restaurant.getMenu();
        for (MenuItem item : menu) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setAvailable(true);
                return true;
            }
        }
        return false;
    }
}
