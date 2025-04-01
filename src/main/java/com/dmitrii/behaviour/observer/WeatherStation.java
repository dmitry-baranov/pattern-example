package com.dmitrii.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<WeatherObserver> weatherObservers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver e : weatherObservers) {
            e.update(temperature, humidity, pressure);
        }
    }
}
