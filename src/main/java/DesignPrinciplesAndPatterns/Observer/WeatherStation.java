package DesignPrinciplesAndPatterns.Observer;
// This is the client
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentStatsDisplay currentDisplay = new CurrentStatsDisplay();
        AverageStatsDisplay averageDisplay = new AverageStatsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(averageDisplay);
        weatherData.registerObserver(forecastDisplay);

        System.out.println("First measurements:");
        weatherData.setMeasurements(30.0f, 65.0f, 1013.0f);

        System.out.println("\nSecond measurements:");
        weatherData.setMeasurements(28.0f, 70.0f, 1012.0f);

        System.out.println("\nThird measurements:");
        weatherData.setMeasurements(26.0f, 90.0f, 1011.0f);
    }
}
