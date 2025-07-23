package DesignPrinciplesAndPatterns.Strategy.BirdV5;

public class HighFlying implements FlyingBehaviour {
    @Override
    public void doFlying() {
        System.out.println("Flying High");
    }
}
