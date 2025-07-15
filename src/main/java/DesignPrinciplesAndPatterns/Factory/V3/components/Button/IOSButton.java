package DesignPrinciplesAndPatterns.Factory.V2.components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("iOS Button clicked!");
    }
}
