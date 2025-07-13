package DesignPrinciplesAndPatterns.Builder.V0;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        // Way 1: Using the constructor to create a SoldItem object
        // Way 2: using setters to set properties one by one
        // Way 3: Using a HashMap to set properties
        // Way 4: Using another custom class to take input on behalf of original class

        // Create a SoldItem object using the constructor
        SoldItem item = new SoldItem();

        item.setItem(101);
        item.setQuantity(2);
        item.setPrice(29.99);
        item.setDescription("Wireless Mouse");
        item.setSeller("TechStore");
        item.setIsPrime(true);
        item.setDiscount(0.1f); // 10% discount
        item.setShippingMethod("Express");
        item.setPaymentMethod("Credit Card");

        // Print the SoldItem object
        System.out.println("Sold Item Details:");
        System.out.println("Item ID: " + item.item);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: $" + item.price);
        System.out.println("Description: " + item.description);
        System.out.println("Seller: " + item.seller);
        System.out.println("Is Prime: " + item.isPrime);
        System.out.println("Discount: " + item.discount * 100 + "%");
        System.out.println("Shipping Method: " + item.shippingMethod);
        System.out.println("Payment Method: " + item.paymentMethod);

        // However, this approach has limitations:
        // We are having to first create the object and then set its properties one by one.
        // Some methods can be called even before the object is fully initialized, leading to potential inconsistencies.
        // If there are any rules for a few fields to allow the object to be created, how do we enforce that? Because here the object is first created and then properties are set.

        // 1. If new fields are added, we need to modify the constructor and all setter methods.
        // 2. The order of fields matters, and changing it would require changes in the constructor.
        // 3. It can lead to a situation where some fields are set while others are not, leading to an inconsistent state.
        // 4. It does not enforce immutability, which can lead to unintended changes after the object is created.
        // 5. If we have many optional fields, the constructor can become unwieldy.
        // 6. It does not provide a clear way to enforce required fields.
        // 7. It does not provide a way to create different variations of the object easily.
        // 8. It does not provide a way to create a complex object step by step.
        // 9. It does not provide a way to create an object with a fluent interface.
        // 10. It does not provide a way to create an object with a clear and readable syntax.
        // In conclusion, while this approach works for simple objects, it does not scale well for complex objects.
        // A better approach would be to use the Builder pattern, which allows for a more flexible and readable way to create complex objects.

        // Another solution could be that we create a HashMap of properties and then set the properties using the map.
        // And use this map to call the constructor of the SoldItem class.
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("item", item);
        properties.put("quantity", 2);
        properties.put("price", 29.99);
        properties.put("description", "Wireless Mouse");
        properties.put("seller", "TechStore");
        properties.put("isPrime", true);
        properties.put("discount", 0.1f); // 10% discount
        properties.put("shippingMethod", "Express");
        properties.put("paymentMethod", "Credit Card");
        // This approach allows us to set properties in any order and only set the properties we want.
        // However, it does not provide type safety and can lead to runtime errors if the wrong type is used.
        // Additionally, it does not provide a way to enforce required fields or create complex objects step by step.
        // This approach is also not recommended for complex objects.
        System.out.println("Sold Item Details from HashMap:");
        System.out.println("Item ID: " + properties.get("item"));
        System.out.println("Quantity: " + properties.get("quantity"));
        System.out.println("Price: $" + properties.get("price"));
        System.out.println("Description: " + properties.get("description"));
        System.out.println("Seller: " + properties.get("seller"));
        System.out.println("Is Prime: " + properties.get("isPrime"));
        System.out.println("Discount: " + ((float) properties.get("discount") * 100) + "%");
        System.out.println("Shipping Method: " + properties.get("shippingMethod"));
        System.out.println("Payment Method: " + properties.get("paymentMethod"));

        // Use the map to call the constructor of the SoldItem class
//        SoldItem soldItem = new SoldItem(properties);

        // Two big issues with this approach:
        // The name of the fields in the map must match the names of the fields in the SoldItem class.
        // If we add a new field to the SoldItem class, we need to remember to add it to the map.
        // The type of the values in the map must match the types of the fields in the SoldItem class.
        // If we pass the wrong type, it will lead to a runtime error.
        // For example, if we pass a String instead of an int for the item field, it will throw a ClassCastException at runtime.
        // This approach is also not recommended for complex objects.

        // Is there any better solution which can be like HashMap but also provides type safety and allows us to create complex objects step by step?
        // We can create another custom class to represent the properties of the SoldItem object and use that class to set the properties.
        // This class can have methods to set the properties and a method to build the SoldItem object.
        // Using the Builder class to create a SoldItem object
        Builder builder = new Builder();
        builder.setItem(101);
        builder.setQuantity(5);
        builder.setPrice(29.99);
        builder.setDescription("Wireless Mouse");
        builder.setSeller("TechStore");
        builder.setIsPrime(true);
        builder.setDiscount(0.1f); // 10% discount
        builder.setShippingMethod("Express");
        builder.setPaymentMethod("Credit Card");
        SoldItem soldItem1 = new SoldItem(builder);
        // If new fields are added, we only need to add a new method in the Builder class.
        // If we want to change the order of fields, we can do that in the Builder class without changing the SoldItem class.
        // The validation can be done in the Builder class, ensuring that the SoldItem object is created in a consistent state.
        // The validations can happen in the constructor of the SoldItem class or in the Builder class' setters also.
        // After the builder object is used, the garbage collector will clean it up, so we don't need to worry about memory leaks.
        // Builder objects only responsibility is to take the input, consume the data and create the SoldItem object.





//        SoldItem soldItemFromBuilder = builder
//                .setItem(101)
//                .setQuantity(2)
//                .setPrice(29.99)
//                .setDescription("Wireless Mouse")
//                .setSeller("TechStore")
//                .setIsPrime(true)
//                .setDiscount(0.1f) // 10% discount
//                .setShippingMethod("Express")
//                .setPaymentMethod("Credit Card")
//                .build();

    }
}
