package DesignPrinciplesAndPatterns.Factory.V3.components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("iOS Button clicked!");
    }
}
