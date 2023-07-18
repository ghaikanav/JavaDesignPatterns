package org.lowLevelDesign.observer;

public class CurrentConditionsDisplay implements Display,Observer {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay (WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("The current conditions are:: " + "temperature = " + temperature + ", humidity = " + humidity );
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }
}
