package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private int temperature;
    private int pressure;
    private int humidity;
    private List<Observer> observers;

    WeatherData(){
        this.observers = new ArrayList<Observer>();
    }


    void setData(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
