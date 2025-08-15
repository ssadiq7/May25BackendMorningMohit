package FoodOrderingSystem.repository;

import FoodOrderingSystem.model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private final Map<String, Order> orderMap = new HashMap<>();

    private static final OrderRepository instance = new OrderRepository();

    private OrderRepository() {}

    public static OrderRepository getInstance() {
        return instance;
    }

    public void save(Order order) {
        orderMap.put(order.getOrderId(), order);
    }

    public Order getOrderById(String orderId) {
        return orderMap.get(orderId);
    }

    public Map<String, Order> getAllOrders() {
        return new HashMap<>(orderMap);
    }

    public void clear() {
        orderMap.clear();
    }
}
