package DesignPrinciplesAndPatterns.Observer;
// These are observers
public class ForecastDisplay implements Observer, Display {
    private float currentPressure = 29.92f; // Default pressure
    private float lastPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        String forecast;
        if (currentPressure > lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            forecast = "More of the same";
        } else {
            forecast = "Watch out for cooler, rainy weather";
        }
        System.out.println("Forecast: " + forecast);
    }
}
