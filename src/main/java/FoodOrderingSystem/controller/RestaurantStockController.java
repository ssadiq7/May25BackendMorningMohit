package FoodOrderingSystem.controller;

import FoodOrderingSystem.dto.StockUpdateRequest;
import FoodOrderingSystem.repository.RestaurantRepository;
import FoodOrderingSystem.service.RestaurantService;

import java.util.HashMap;
import java.util.Map;

public class RestaurantStockController {

    private final RestaurantService restaurantService;

    public RestaurantStockController() {
        this.restaurantService = new RestaurantService(RestaurantRepository.getInstance());
    }

    public Map<String, String> markOutOfStock(StockUpdateRequest request) {
        boolean success = restaurantService.markItemOutOfStock(
                request.getRestaurantName(),
                request.getItemName()
        );
        Map<String, String> response = new HashMap<>();
        response.put("status", success ? "SUCCESS" : "FAILED");
        return response;
    }

    public Map<String, String> restockItem(StockUpdateRequest request) {
        boolean success = restaurantService.restockItem(
                request.getRestaurantName(),
                request.getItemName()
        );
        Map<String, String> response = new HashMap<>();
        response.put("status", success ? "SUCCESS" : "FAILED");
        return response;
    }

}
