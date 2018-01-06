package com.avengers.steve.DesignPattern.Observer.observerJava;

import com.avengers.core.demo.DesignPattern.Observer.observerJava.core.DisplayElement;
import com.avengers.core.demo.DesignPattern.Observer.observerJava.core.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public WeatherDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
