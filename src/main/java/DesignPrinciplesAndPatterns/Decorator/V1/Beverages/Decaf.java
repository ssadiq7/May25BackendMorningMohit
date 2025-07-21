package DesignPrinciplesAndPatterns.Decorator.V1.Beverages;

import DesignPrinciplesAndPatterns.Decorator.V1.Beverage;

public class Decaf extends Beverage {
    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public void getDescription() {
        System.out.println("Decaf Coffee");
    }
}
