package DesignPrinciplesAndPatterns.Strategy.BirdV5;

import java.util.List;

public class Client {

    public static void doSomething(List<Flyable> birds){
        for(Flyable bird : birds) {
            bird.fly();
        }
    }

    public static void main(String[] args) {
//        Bird b = new Pegion();
//        Pegion b1 = new Pegion();
//        Flyable f = new Pegion();
//
//        b.setFlyingBehaviorType(FlyingBehaviorType.LOW);

        // Added to demonstrate Strategy pattern
        // On the basis of FlyingBehaviorType we should be able to use whatever strategy is there
        Sparrow sp = new Sparrow(FlyingBehaviorType.LOW);
        sp.fly();

        // The below piece of code is old only, only the top 2 lines meant for Strategy Design Pattern
        sp.setFlyingBehaviour(new HighFlying());
        sp.fly();
    }
}


// PhonePe : YesBank => RBI said , yes bank you can't support transactions anymore


// PhonePe => <<BankAPI>> methods => Yes Bank Implemented these methods