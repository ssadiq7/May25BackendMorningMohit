package DesignPrinciplesAndPatterns.Builder.V3;

public class Client {
    public static void main(String[] args) {

        SoldItemBuilder builder = new SoldItemBuilder();
        SoldItem item = builder.setItem(1)
                .setQuantity(10)
                .setPrice(19.99)
                .setDescription("A great item")
                .setSeller("SellerName")
                .setIsPrime(true)
                .setDiscount(0.1f)
                .setShippingMethod("Standard")
                .setPaymentMethod("Credit Card")
                .build();

        System.out.println("Sold Item Created: " + item.getDescription());
        System.out.println("Item ID: " + item.getItem());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Seller: " + item.getSeller());
        System.out.println("Is Prime: " + item.isPrime());
        System.out.println("Discount: " + (item.getDiscount() * 100) + "%");
        System.out.println("Shipping Method: " + item.getShippingMethod());
        System.out.println("Payment Method: " + item.getPaymentMethod());


        // This approach allows for a more readable and maintainable way to create complex objects.
        // The Builder pattern provides a clear and fluent interface for constructing objects,
        // making it easier to understand and use, especially when dealing with many optional parameters.
        // It also allows for better validation and immutability, as the object is built in a single step
        // and can be made immutable once constructed.
        // The Builder pattern is particularly useful when dealing with objects that have many optional parameters,
        // as it allows for a clear and concise way to set only the parameters that are needed,
        // while still providing a way to enforce required parameters.
        // This pattern is widely used in Java libraries and frameworks, such as the StringBuilder class,
        // which provides a fluent interface for constructing strings.
        // The Builder pattern is a design pattern that provides a flexible solution to constructing complex objects.
        // It allows for a step-by-step construction process, making it easier to create objects with many parameters.

    }
}
