package DesignPrinciplesAndPatterns.Builder.V3;

public class SoldItem {
    private int item;
    private int quantity;
    private double price;
    private String description;
    private String seller;
    private boolean isPrime;
    private float discount;
    private String shippingMethod;
    private String paymentMethod;

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

    // Getters
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

    public SoldItem(SoldItemBuilder builder) {
        this.item = builder.getItem();
        this.quantity = builder.getQuantity();
        this.price = builder.getPrice();
        this.description = builder.getDescription();
        this.seller = builder.getSeller();
        this.isPrime = builder.isPrime();
        this.discount = builder.getDiscount();
        this.shippingMethod = builder.getShippingMethod();
        this.paymentMethod = builder.getPaymentMethod();
    }

}
