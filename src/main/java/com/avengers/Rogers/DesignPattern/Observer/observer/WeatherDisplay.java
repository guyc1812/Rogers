package com.avengers.Rogers.DesignPattern.Observer.observer;

import com.avengers.Rogers.DesignPattern.Observer.observer.core.DisplayElement;
import com.avengers.Rogers.DesignPattern.Observer.observer.core.Observer;
import com.avengers.Rogers.DesignPattern.Observer.observer.core.Subject;

public class WeatherDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public WeatherDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
