package FoodOrderingSystem.dto;

import FoodOrderingSystem.model.DeliveryPartner;

import java.util.UUID;

public class AssignmentResponse {
    private UUID orderId;
    private DeliveryPartner assignedDeliveryPartner;
    private String status;

    public AssignmentResponse() {}

    public AssignmentResponse(UUID orderId, DeliveryPartner assignedDeliveryPartner, String status) {
        this.orderId = orderId;
        this.assignedDeliveryPartner = assignedDeliveryPartner;
        this.status = status;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public DeliveryPartner getAssignedDeliveryPartner() {
        return assignedDeliveryPartner;
    }

    public void setAssignedDeliveryPartner(DeliveryPartner assignedDeliveryPartner) {
        this.assignedDeliveryPartner = assignedDeliveryPartner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
