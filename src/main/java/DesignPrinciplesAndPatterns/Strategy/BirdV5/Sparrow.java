package DesignPrinciplesAndPatterns.Strategy.BirdV5;

public class Sparrow extends Bird implements Flyable {
    FlyingBehaviour flyingBehaviour;
//    Sparrow(FlyingBehaviour flyingBehaviour){
////        this.flyingBehaviour = new LowFlying();
//        this.flyingBehaviour = flyingBehaviour;
//    }

    // Added to demonstrate Strategy pattern
    Sparrow(FlyingBehaviorType flyingBehaviorType) {
        // Now based on the FlyingBehaviorType we need to create the corresponding algorithm
        // We can do this in simple factory method
        this.flyingBehaviour = FlyingBehaviorFactory.createFlyingBehaviorByType(flyingBehaviorType);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
//        System.out.println("Flying Low");
        flyingBehaviour.doFlying();
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }
}
