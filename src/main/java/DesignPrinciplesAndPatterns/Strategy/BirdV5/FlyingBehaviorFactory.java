package DesignPrinciplesAndPatterns.Strategy.BirdV5;

public class FlyingBehaviorFactory {
    public static FlyingBehaviour createFlyingBehaviorByType(FlyingBehaviorType flyingBehaviorType) {
        FlyingBehaviour flyingBehaviour = null;

        if(flyingBehaviorType == FlyingBehaviorType.LOW) {
            flyingBehaviour = new LowFlying();
        }
        else if (flyingBehaviorType == FlyingBehaviorType.HIGH) {
            flyingBehaviour = new HighFlying();
        }

        return flyingBehaviour;
    }
}
