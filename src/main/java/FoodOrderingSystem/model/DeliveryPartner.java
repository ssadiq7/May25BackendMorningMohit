package FoodOrderingSystem.model;

public class DeliveryPartner {
    private String id;
    private String name;
    private GeoLocation location;
    private DeliveryPartner status;

    public DeliveryPartner() {}

    public DeliveryPartner(String id, String name, GeoLocation location, DeliveryPartner status) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public DeliveryPartner getStatus() {
        return status;
    }

    public void setStatus(DeliveryPartner status) {
        this.status = status;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }
}
