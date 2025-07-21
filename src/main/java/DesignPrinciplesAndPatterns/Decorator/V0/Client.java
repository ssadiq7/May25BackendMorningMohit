package DesignPrinciplesAndPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        b.getCost();
        b.getDescription();
    }
}

// We need to introduce Add-ons
// It can be added dynamically
// 