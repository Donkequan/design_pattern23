package com.pattern.observer;

//baidu, moji etc.
public class CurrentCondition implements Observer{

    private int temperature;
    private int pressure;
    private int humidity;

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CurrentCondition{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidty=" + humidity +
                '}';
    }

}
