package DesignPrinciplesAndPatterns.Strategy.AssignmentProblems.PricingStrategy;

public class PricingManager {

    // This is as per the assignment problem statement
    public PricingManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    PricingType pricingType;
    PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    /* ********************************************************** */

    // Proper usage as per strategy pattern
    private PricingStrategy pricingStrategy;
    public PricingManager() {
        // Default constructor
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }
}
