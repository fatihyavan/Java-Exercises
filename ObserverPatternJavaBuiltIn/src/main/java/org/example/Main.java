package org.example;

import org.example.Observable.WeatherData;
import org.example.Observer.CurrentDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisp = new CurrentDisplay(weatherData);
        weatherData.setMeasurements(20,10,100);
        weatherData.setMeasurements(10,10,80);

    }
}