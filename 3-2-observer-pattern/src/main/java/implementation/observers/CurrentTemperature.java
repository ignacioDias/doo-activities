package implementation.observers;
import implementation.subject.Subject;
import weatherdata.WeatherData;

public class CurrentTemperature implements Observer {
    private float temperature;
    private Subject subject;

    public CurrentTemperature(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    public void update() {
        if(subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }
    public void display() {
        System.out.println("Current temperature: " + temperature);
    }
}
