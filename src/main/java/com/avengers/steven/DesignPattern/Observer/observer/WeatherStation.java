package com.avengers.steven.DesignPattern.Observer.observer;

import com.avengers.steven.DesignPattern.Observer.observer.core.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
