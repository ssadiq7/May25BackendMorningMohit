package DesignPrinciplesAndPatterns.Strategy.AssignmentProblems.PricingStrategy;

public class SurgePricingStrategy implements PricingStrategy {
    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
