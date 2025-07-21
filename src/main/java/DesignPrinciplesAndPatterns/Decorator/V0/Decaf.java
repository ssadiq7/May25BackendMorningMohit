package DesignPrinciplesAndPatterns.Decorator.V0;

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
