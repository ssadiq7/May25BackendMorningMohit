package DesignPrinciplesAndPatterns.Builder.V0;

public class SoldItemBuilder {
    // The Builder class is used to create instances of SoldItem.
    // It provides a fluent interface for setting properties and building the object.

    private int item;
    private int quantity;
    private double price;
    private String description;
    private String seller;
    private boolean isPrime;
    private float discount;
    private String shippingMethod;
    private String paymentMethod;

    public SoldItemBuilder() {
        // Default constructor
    }

    public SoldItemBuilder setItem(int item) {
        this.item = item;
        return this;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public SoldItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public SoldItemBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public SoldItemBuilder setSeller(String seller) {
        this.seller = seller;
        return this;
    }

    public SoldItemBuilder setIsPrime(boolean isPrime) {
        this.isPrime = isPrime;
        return this;
    }

    public SoldItemBuilder setDiscount(float discount) {
        this.discount = discount;
        return this;
    }

    public SoldItemBuilder setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public SoldItemBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

//    public SoldItem build() {
//        return new SoldItem(item, quantity, price, description, seller, isPrime, discount, shippingMethod, paymentMethod);
//    }

}
