package FoodOrderingSystem.controller;

import FoodOrderingSystem.dto.PlaceOrderRequest;
import FoodOrderingSystem.dto.PlaceOrderResponse;
import FoodOrderingSystem.repository.OrderRepository;
import FoodOrderingSystem.repository.RestaurantRepository;
import FoodOrderingSystem.service.OrderService;

public class OrderController {

    private final OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService(RestaurantRepository.getInstance(), OrderRepository.getInstance());
    }

    public PlaceOrderResponse placeOrder(PlaceOrderRequest request) {
        return orderService.placeOrder(request);
    }

}
