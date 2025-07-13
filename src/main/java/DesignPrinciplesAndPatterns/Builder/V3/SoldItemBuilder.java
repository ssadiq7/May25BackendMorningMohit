package DesignPrinciplesAndPatterns.Builder.V3;

public class SoldItemBuilder {
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
        if (quantity < 5) {
            throw new IllegalArgumentException("Quantity must be at least 5.");
        }
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

    public SoldItem build() {
        return new SoldItem(item, quantity, price, description, seller, isPrime, discount, shippingMethod, paymentMethod);
    }

    // Getters for testing purposes
    public int getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getSeller() {
        return seller;
    }
    public boolean isPrime() {
        return isPrime;
    }
    public float getDiscount() {
        return discount;
    }
    public String getShippingMethod() {
        return shippingMethod;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

}
