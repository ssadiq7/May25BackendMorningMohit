package DesignPrinciplesAndPatterns.Builder.V1;

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

    // Setters for the properties
//    public void setItem(int item) {
//        this.item = item;
//    }
//    public void setQuantity(int quantity) {
//        if(quantity < 5) {
//            throw new IllegalArgumentException("Quantity must be at least 5.");
//        }
//        this.quantity = quantity;
//    }
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//    public void setSeller(String seller) {
//        this.seller = seller;
//    }
//    public void setIsPrime(boolean isPrime) {
//        this.isPrime = isPrime;
//    }
//    public void setDiscount(float discount) {
//        this.discount = discount;
//    }
//    public void setShippingMethod(String shippingMethod) {
//        this.shippingMethod = shippingMethod;
//    }
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }

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



    public void setItem(int item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
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

    public SoldItem build() {
        return new SoldItem(item, quantity, price, description, seller, isPrime, discount, shippingMethod, paymentMethod);
    }

}
