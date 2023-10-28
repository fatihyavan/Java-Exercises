package org.example.Screens;

import org.example.DisplayElement;
import org.example.Observer.Observer;
import org.example.Subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float pressure;
    private float humidity;
    private Subject weatherData;
    public ForecastDisplay(Subject data){
        this.weatherData = data;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
    this.humidity = humidity;
    this.pressure = pressure;
    display();
    }

    @Override
    public void display() {
        System.out.println("Forecast Dipslay : Pressure => " + pressure + " Humidity =>" +humidity );
    }
}
