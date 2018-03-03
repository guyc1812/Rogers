package com.avengers.Rogers.DesignPattern.Observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        WeatherDisplay weatherDisplay1 = new WeatherDisplay("display1",weatherData);
        WeatherDisplay weatherDisplay2 = new WeatherDisplay("display2",weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        // [display1] Current conditions: 80.0F degrees 65.0% humidity and 30.4 presure
        // [display1] Current conditions: 81.0F degrees 70.0% humidity and 29.2 presure
        // [display1] Current conditions: 78.0F degrees 90.0% humidity and 29.2 presure

        // [display2] Current conditions: 80.0F degrees 65.0% humidity and 30.4 presure
        // [display2] Current conditions: 81.0F degrees 70.0% humidity and 29.2 presure
        // [display2] Current conditions: 78.0F degrees 90.0% humidity and 29.2 presure
    }
}
