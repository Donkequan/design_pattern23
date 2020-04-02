package com.pattern.observer;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition();
        Baidu baidu = new Baidu();

        weatherData.registerObserver(currentCondition);
        weatherData.registerObserver(baidu);

        weatherData.setData(10, 10, 10);


    }
}
