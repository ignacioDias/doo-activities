package weatherstation;

public class NewDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public NewDisplay() { };

    public NewDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity. Pressure:" + pressure);
    }
}
