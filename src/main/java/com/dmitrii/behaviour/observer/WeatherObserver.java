package com.dmitrii.behaviour.observer;

public interface WeatherObserver {
    public void update(float temperature, float humidity, float pressure);
}
