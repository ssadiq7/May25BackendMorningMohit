package DesignPrinciplesAndPatterns.Decorator.V1;

public abstract class Addon extends Beverage {
    protected Beverage beverage;

    public Addon(Beverage beverage) {
        this.beverage = beverage;
    }
}

// Every addon will be top on of the existing beverage.
// So we will add a constructor that takes a Beverage object.