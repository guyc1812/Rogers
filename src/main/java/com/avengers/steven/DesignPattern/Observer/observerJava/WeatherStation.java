package com.avengers.steven.DesignPattern.Observer.observerJava;

import com.avengers.steven.DesignPattern.Observer.observerJava.core.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        WeatherDisplay weatherDisplay = new WeatherDisplay(weatherData);

        weatherData.setMeasurements(81, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
