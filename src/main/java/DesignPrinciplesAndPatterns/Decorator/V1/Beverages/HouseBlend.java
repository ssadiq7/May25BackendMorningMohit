package DesignPrinciplesAndPatterns.Decorator.V1;

public class HouseBlend extends Beverage {
    @Override
    public int getCost() {
        return 45; // Cost of House Blend coffee
    }

    @Override
    public void getDescription() {
        System.out.println("House Blend Coffee");
    }
}
