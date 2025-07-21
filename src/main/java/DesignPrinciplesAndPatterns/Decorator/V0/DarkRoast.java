package DesignPrinciplesAndPatterns.Decorator;

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
