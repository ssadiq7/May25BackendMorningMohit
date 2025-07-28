package DesignPrinciplesAndPatterns.Observer;
// These are observers
public class CurrentStatsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity, " + pressure + " hPa pressure");
    }
}
