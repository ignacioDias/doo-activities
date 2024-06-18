package implementation.subject;

import implementation.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataPull {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherDataPull() {
        observers = new ArrayList<>();
    }
    public void setAtributes(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
