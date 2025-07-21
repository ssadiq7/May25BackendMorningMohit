package DesignPrinciplesAndPatterns.Decorator.V1;

public class Chocochip extends Addon {
    public Chocochip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 2 + beverage.getCost();
        // Adding the cost of Whip to the existing beverage cost
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Choco Chip");
        // Adding whip on top of the existing beverage
    }
}

// This class extends Addon, which means it is a type of addon for a Beverage.
// Addon is extending Beverage, so it needs to have the properties and methods of Beverage.
// Addons will also have cost and description, which will be added to the Beverage they are decorating.