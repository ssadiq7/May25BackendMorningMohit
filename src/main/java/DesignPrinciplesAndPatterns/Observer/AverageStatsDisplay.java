package DesignPrinciplesAndPatterns.Observer;
// These are observers
public class AverageStatsDisplay implements Observer, Display {
    private float totalTemperature = 0.0f;
    private float totalHumidity = 0.0f;
    private float totalPressure = 0.0f;
    private int count = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        totalTemperature += temperature;
        totalHumidity += humidity;
        totalPressure += pressure;
        count++;
        display();
    }

    @Override
    public void display() {
        if (count > 0) {
            System.out.println("Average conditions: " + (totalTemperature / count) + "°C, "
                + (totalHumidity / count) + "% humidity, "
                + (totalPressure / count) + " hPa pressure");
        }
    }
}
