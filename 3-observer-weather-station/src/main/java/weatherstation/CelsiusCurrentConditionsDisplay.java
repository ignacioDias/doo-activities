package weatherstation;

public class CelsiusCurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public CelsiusCurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = (float) ((temperature - 32) / 1.8);
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display() {
        System.out.println("Current temperature: " + temperature);
    }
}
