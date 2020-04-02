package com.pattern.observer;

public class Baidu implements Observer {

    private String Name = "baidu";
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
        return "Baidu{" +
                "Name='" + Name + '\'' +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
