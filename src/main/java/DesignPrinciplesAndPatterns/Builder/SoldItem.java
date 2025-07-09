package DesignPrinciplesAndPatterns.Builder;

public class SoldItem {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;


    public SoldItem(SoldItemBuilder soldItemBuilder) {
        // validations can be done over here also
        this.id = soldItemBuilder.getId();
        this.name = soldItemBuilder.getName();
        this.price = soldItemBuilder.getPrice();
        this.quantity = soldItemBuilder.getQuantity();
        this.isPrime = soldItemBuilder.isPrime();
        this.discount = soldItemBuilder.getDiscount();
        this.paymentMethod = soldItemBuilder.getPaymentMethod();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
