package DesignPrinciplesAndPatterns.Builder.V4;

public class SoldItem {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    // Private constructor to enforce the use of the builder
    SoldItem(SoldItemBuilder soldItemBuilder) {
        this.id = soldItemBuilder.getId();
        this.name = soldItemBuilder.getName();
        this.price = soldItemBuilder.getPrice();
        this.quantity = soldItemBuilder.getQuantity();
        this.isPrime = soldItemBuilder.isPrime();
        this.discount = soldItemBuilder.getDiscount();
        this.paymentMethod = soldItemBuilder.getPaymentMethod();
    }

    // Original class is taking the responsibility of providing the builder
    public static SoldItemBuilder getBuilder(){
        return new SoldItemBuilder();
    }

    // Getters for the fields
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public boolean isPrime() {
        return isPrime;
    }
    public double getDiscount() {
        return discount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

//    // Setters for the fields
//    public void setId(int id) {
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setPrice(int price) {
//        this.price = price;
//    }
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//    public void setPrime(boolean isPrime) {
//        this.isPrime = isPrime;
//    }
//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }

}
