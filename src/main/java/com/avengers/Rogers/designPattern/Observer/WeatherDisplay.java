package com.avengers.Rogers.designPattern.Observer;

import com.avengers.Rogers.designPattern.Observer.core.Observer;
import com.avengers.Rogers.designPattern.Observer.core.Subject;

public class WeatherDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private String name;

    public WeatherDisplay(String name, Subject weatherData) {
        this.name = name;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println(
            "[" + name + "] Current conditions: " +
            temperature + "F degrees " +
            humidity + "% humidity and " +
            pressure + " presure");
    }
}
