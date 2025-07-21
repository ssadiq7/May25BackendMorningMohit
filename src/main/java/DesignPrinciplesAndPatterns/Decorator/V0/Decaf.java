package DesignPrinciplesAndPatterns.Decorator;

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
