package DesignPrinciplesAndPatterns.Decorator.V1;

import DesignPrinciplesAndPatterns.Decorator.V1.Addons.Chocochip;
import DesignPrinciplesAndPatterns.Decorator.V1.Addons.Milk;
import DesignPrinciplesAndPatterns.Decorator.V1.Addons.Soy;
import DesignPrinciplesAndPatterns.Decorator.V1.Beverages.Decaf;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        System.out.println(b.getCost()); // It should return the cost of Decaf beverage
        b.getCost();
        b.getDescription();

        Beverage b1 = new Chocochip(new Milk(b));
        // Adding Milk and ChocoChip to the Decaf beverage
        b1 = new Soy(b1); // Adding Soy to the existing beverage with Milk and ChocoChip
        // If you want doube choco chip, you can do it like this
        b1 = new Chocochip(b1); // Adding another ChocoChip to the existing beverage with Milk and Soy
        // We can apply as many customizations as we want

        System.out.println(b1.getCost()); // It should return the total cost of the beverage with all addons
        b1.getDescription(); // It should print the description of the beverage with all addons
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

// This design pattern is implemented in Java's I/O classes
// For example, BufferedReader is a decorator for Reader
// and it adds new functionality to the Reader class
// Similarly, BufferedWriter is a decorator for Writer
// and it adds new functionality to the Writer class