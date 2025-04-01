package com.dmitrii.behaviour.observer;

public class PhoneDisplay implements WeatherObserver{

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public String getDisplay() {
        return "PhoneDisplay - Temp: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + "hPa";
    }
}
