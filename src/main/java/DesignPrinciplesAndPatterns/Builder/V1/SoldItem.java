package DesignPrinciplesAndPatterns.Builder.V1;

import java.util.HashMap;

public class SoldItem {
    int item;
    int quantity;
    double price;
    String description;
    String seller;
    boolean isPrime;
    float discount;
    String shippingMethod;
    String paymentMethod;

    public SoldItem() {
        // Default constructor
    }

    public SoldItem(int item, int quantity, double price, String description, String seller, boolean isPrime, float discount, String shippingMethod, String paymentMethod) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.seller = seller;
        this.isPrime = isPrime;
        this.discount = discount;
        this.shippingMethod = shippingMethod;
        this.paymentMethod = paymentMethod;
    }

    public SoldItem(HashMap<String, Object> properties) {
        if (properties.containsKey("item")) {
            this.item = (int) properties.get("item");
        }
        if (properties.containsKey("quantity")) {
            this.quantity = (int) properties.get("quantity");
        }
        if (properties.containsKey("price")) {
            this.price = (double) properties.get("price");
        }
        if (properties.containsKey("description")) {
            this.description = (String) properties.get("description");
        }
        if (properties.containsKey("seller")) {
            this.seller = (String) properties.get("seller");
        }
        if (properties.containsKey("isPrime")) {
            this.isPrime = (boolean) properties.get("isPrime");
        }
        if (properties.containsKey("discount")) {
            this.discount = (float) properties.get("discount");
        }
        if (properties.containsKey("shippingMethod")) {
            this.shippingMethod = (String) properties.get("shippingMethod");
        }
        if (properties.containsKey("paymentMethod")) {
            this.paymentMethod = (String) properties.get("paymentMethod");
        }
    }

    public SoldItem(SoldItemBuilder soldItemBuilder) {
        // Validations can be done here also if needed
        this.item = soldItemBuilder.getItem();
        this.quantity = soldItemBuilder.getQuantity();
        this.price = soldItemBuilder.getPrice();
        this.description = soldItemBuilder.getDescription();
        this.seller = soldItemBuilder.getSeller();
        this.isPrime = soldItemBuilder.isPrime();
        this.discount = soldItemBuilder.getDiscount();
        this.shippingMethod = soldItemBuilder.getShippingMethod();
        this.paymentMethod = soldItemBuilder.getPaymentMethod();
    }

    // This is not an efficient builder pattern implementation.
    // What if new fields are added?
    // What if we want to change the order of fields?
    // What if we want to make some fields optional?
    // If we start to different combinations of fields, the constructor will become unwieldy.

    // Instead of going with multiple constructors what if we use setters?
    // Using setters would allow us to set only the fields we want, but it would also make the object mutable.
    // Chances of passing wrong values in constructor are less than passing wrong values in setters.

    public void setItem(int item) {
        this.item = item;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }
    public void setIsPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }

    // Original class is taking the responsibility of providing the builder.
    public static SoldItemBuilder getBuilder() {
        return new SoldItemBuilder();
    }

}
