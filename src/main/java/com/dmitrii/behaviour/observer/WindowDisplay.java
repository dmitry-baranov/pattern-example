package com.dmitrii.behaviour.observer;

public class WindowDisplay implements WeatherObserver{

    private float temperature;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
    }

    public String getDisplay() {
        return "WindowDisplay shows temperature: " + temperature + "°C";
    }
}
