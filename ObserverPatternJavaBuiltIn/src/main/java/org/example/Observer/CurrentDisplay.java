package org.example.Observer;

import org.example.Display;
import org.example.Observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, Display {
    Observable observable;
    private float temperature;
    private float pressure;

    public CurrentDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = new WeatherData();
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            displayData();

        }
    }

    @Override
    public void displayData() {
        System.out.println("Current Forecasting =>>>");
        System.out.println("Temperature => " + temperature + "|||| Pressure ==>" + pressure);
    }
}
