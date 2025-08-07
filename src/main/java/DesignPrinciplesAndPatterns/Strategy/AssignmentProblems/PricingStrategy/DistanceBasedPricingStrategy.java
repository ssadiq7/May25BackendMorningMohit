package DesignPrinciplesAndPatterns.Strategy.AssignmentProblems.PricingStrategy;

public class DistanceBasedPricingStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
//        if (rideDetails == null) {
//            throw new IllegalArgumentException("Ride details cannot be null");
//        }
//
//        double distance = rideDetails.getDistance();
//        int duration = rideDetails.getDuration();
//
//        // Calculate the price based on distance and duration
//        double price = BASE_FARE + (PER_KILOMETER_RATE * distance) + (PER_MINUTE_RATE * duration);
//
//        return price;
        return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
    }
}
