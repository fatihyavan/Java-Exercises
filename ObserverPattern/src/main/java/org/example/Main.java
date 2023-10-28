package org.example;

import org.example.Screens.CurrentConditionDisplay;
import org.example.Screens.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay foreacastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,60,110);
        weatherData.setMeasurements(8,20,160);
    }
}