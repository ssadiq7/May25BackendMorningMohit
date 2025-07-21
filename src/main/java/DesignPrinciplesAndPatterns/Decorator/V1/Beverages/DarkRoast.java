package DesignPrinciplesAndPatterns.Decorator.V1.Beverages;

import DesignPrinciplesAndPatterns.Decorator.V1.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public void getDescription() {
        System.out.println("Dark Roast Coffee");
    }
}
