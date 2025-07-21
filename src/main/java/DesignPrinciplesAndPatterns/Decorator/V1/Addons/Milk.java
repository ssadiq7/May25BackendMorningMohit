package DesignPrinciplesAndPatterns.Decorator.V1;

public class Milk extends Addon {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 12 + beverage.getCost();
        // Adding the cost of Whip to the existing beverage cost
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Milk");
        // Adding whip on top of the existing beverage
    }
}
