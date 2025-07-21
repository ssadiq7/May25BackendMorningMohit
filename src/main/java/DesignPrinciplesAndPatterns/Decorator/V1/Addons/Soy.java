package DesignPrinciplesAndPatterns.Decorator.V1;

public class Soy extends Addon {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return 8 + beverage.getCost();
        // Adding the cost of Whip to the existing beverage cost
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Added Soy");
        // Adding whip on top of the existing beverage
    }
}
