package DesignPrinciplesAndPatterns.Strategy.AssignmentProblems.PricingStrategy;

public class Client {
    public static void main(String[] args) {
        double price;

        // This is as per the assignment problem statement
        PricingManager pricingManager = new PricingManager(new SurgePricingStrategy());
        price = pricingManager.calculatePrice(new RideDetails(10.0, 5));
        System.out.println("Surge Pricing: " + price);

        pricingManager = new PricingManager(new DistanceBasedPricingStrategy());
        price = pricingManager.calculatePrice(new RideDetails(10.0, 5));
        System.out.println("Distance Based Pricing: " + price);

        pricingManager = new PricingManager(new TimeBasedPricingStrategy());
        price = pricingManager.calculatePrice(new RideDetails(10.0, 5));
        System.out.println("Time Based Pricing: " + price);

        /* ********************************************************** */

        // Proper usage as per strategy pattern
        pricingManager = new PricingManager();
        pricingManager.setPricingStrategy(new SurgePricingStrategy());
        price = pricingManager.calculatePrice(new RideDetails(10.0, 5));
        System.out.println("Surge Pricing after setting strategy: " + price);
    }
}
