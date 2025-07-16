package DesignPrinciplesAndPatterns.Factory.V1.components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked!");
    }
}
