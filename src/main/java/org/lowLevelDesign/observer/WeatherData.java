package org.lowLevelDesign.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void measurementsChanged () {
        notifyObservers();
    }

    public void setMeasurements (float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("======= " + observer.getClass() + " successfully registered with WeatherData =======");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("======= " + observer.getClass() + " successfully removed from WeatherData =======");
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }
}
