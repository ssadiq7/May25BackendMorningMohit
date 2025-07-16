package DesignPrinciplesAndPatterns.Factory.V0.components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked!");
    }
}
