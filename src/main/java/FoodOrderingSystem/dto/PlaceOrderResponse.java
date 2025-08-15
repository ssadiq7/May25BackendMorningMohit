package FoodOrderingSystem.dto;

public class PlaceOrderResponse {

    private String status;
    private String orderId;
    private int totalAmount;
    private int estimatedDeliveryTimeMinutes;
    private String message;

    private PlaceOrderResponse() {}

    public static PlaceOrderResponse success(String orderId, int totalAmount, int deliveryTime) {
        PlaceOrderResponse res = new PlaceOrderResponse();
        res.status = "PLACED";
        res.orderId = orderId;
        res.totalAmount = totalAmount;
        res.estimatedDeliveryTimeMinutes = deliveryTime;
        return res;
    }

    public static PlaceOrderResponse failure(String message) {
        PlaceOrderResponse res = new PlaceOrderResponse();
        res.status = "FAILED";
        res.message = message;
        return res;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getEstimatedDeliveryTimeMinutes() {
        return estimatedDeliveryTimeMinutes;
    }

    public String getMessage() {
        return message;
    }

}
