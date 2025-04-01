package com.dmitrii.behaviour.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void testObserversAreUpdated() {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay();
        WindowDisplay window = new WindowDisplay();

        station.addObserver(phone);
        station.addObserver(window);

        station.setMeasurements(22.5f, 60f, 1013f);

        assertEquals("PhoneDisplay - Temp: 22.5°C, Humidity: 60.0%, Pressure: 1013.0hPa", phone.getDisplay());
        assertEquals("WindowDisplay shows temperature: 22.5°C", window.getDisplay());
    }

    @Test
    void testObserverRemoval() {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();

        station.addObserver(phone);
        station.setMeasurements(20f, 50f, 1000f);
        station.removeObserver(phone);
        station.setMeasurements(30f, 90f, 999f);  // Should not update the removed observer

        assertEquals("PhoneDisplay - Temp: 20.0°C, Humidity: 50.0%, Pressure: 1000.0hPa", phone.getDisplay());
    }

}