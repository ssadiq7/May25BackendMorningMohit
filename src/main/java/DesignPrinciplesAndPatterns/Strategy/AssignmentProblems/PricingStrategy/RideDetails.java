package DesignPrinciplesAndPatterns.Strategy.AssignmentProblems.PricingStrategy;

public class RideDetails {
    private double distance; // Distance in kilometers
    private int duration; // Duration in minutes

    // AllArgsConstructor
    public RideDetails(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    // Getters
    public double getDistance() {
        return distance;
    }
    public int getDuration() {
        return duration;
    }
}
