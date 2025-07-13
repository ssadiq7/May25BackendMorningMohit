package DesignPrinciplesAndPatterns.Builder.V4;

public class Client {
    public static void main(String[] args) {
        // Way 1 : Using long and multiple constructors
        // Way 2 : Using setters
        // Way 3 : Using a HashMap
        // Way 4 : Using another custom class to take input on behalf of original class

        // Using the builder to create a SoldItem instance
        SoldItem soldItem = SoldItem.getBuilder()
                .setId(1)
                .setName("Laptop")
                .setPrice(1500)
                .setQuantity(2)
                .setPrime(true)
                .setDiscount(10.0)
                .setPaymentMethod("Credit Card")
                .build();

        // Displaying the SoldItem details
        System.out.println("Sold Item Details:");
        System.out.println("ID: " + soldItem.getId());
        System.out.println("Name: " + soldItem.getName());
        System.out.println("Price: $" + soldItem.getPrice());
        System.out.println("Quantity: " + soldItem.getQuantity());
        System.out.println("Is Prime: " + soldItem.isPrime());
        System.out.println("Discount: " + soldItem.getDiscount() + "%");
        System.out.println("Payment Method: " + soldItem.getPaymentMethod());
    }
}
