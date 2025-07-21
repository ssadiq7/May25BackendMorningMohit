package DesignPrinciplesAndPatterns.Decorator.V1;

public class Whip extends Addon {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 5 + beverage.getCost();
        // Adding the cost of Whip to the existing beverage cost
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Whip");
        // Adding whip on top of the existing beverage
    }
}
