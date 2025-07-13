package DesignPrinciplesAndPatterns.Builder.V0;

public class Builder {
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

    public Builder() {
        // Default constructor
    }

    // Setters for the properties
    public void setItem(int item) {
        this.item = item;
    }
    public void setQuantity(int quantity) {
        if(quantity < 5) {
            throw new IllegalArgumentException("Quantity must be at least 5.");
        }
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
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
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Getters for the properties
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



//    public Builder setItem(int item) {
//        this.item = item;
//        return this;
//    }
//
//    public Builder setQuantity(int quantity) {
//        this.quantity = quantity;
//        return this;
//    }
//
//    public Builder setPrice(double price) {
//        this.price = price;
//        return this;
//    }
//
//    public Builder setDescription(String description) {
//        this.description = description;
//        return this;
//    }
//
//    public Builder setSeller(String seller) {
//        this.seller = seller;
//        return this;
//    }
//
//    public Builder setIsPrime(boolean isPrime) {
//        this.isPrime = isPrime;
//        return this;
//    }
//
//    public Builder setDiscount(float discount) {
//        this.discount = discount;
//        return this;
//    }
//
//    public Builder setShippingMethod(String shippingMethod) {
//        this.shippingMethod = shippingMethod;
//        return this;
//    }
//
//    public Builder setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//        return this;
//    }

//    public SoldItem build() {
//        return new SoldItem(item, quantity, price, description, seller, isPrime, discount, shippingMethod, paymentMethod);
//    }

}
