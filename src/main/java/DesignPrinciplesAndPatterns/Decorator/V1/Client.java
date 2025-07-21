package DesignPrinciplesAndPatterns.Decorator.V0;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        b.getCost();
        b.getDescription();
    }
}

// We need to introduce Add-ons
// It can be added dynamically
// The add-ons can be added at any time
// And we don't want to change the existing code
// We can use the Decorator Pattern to achieve this
// The Decorator Pattern allows us to add new functionality to an object dynamically
// without changing its structure
// The Decorator Pattern is a structural pattern that allows us to add new functionality to an object
// without changing its structure
// We will add a new class called AddOn and this can be also an abstract class