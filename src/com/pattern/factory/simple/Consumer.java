package com.pattern.factory.simple;

public class Consumer {

    public static void main(String[] args) {
        Car tesla = CarFactory.getCar("tesla");
        tesla.name();
        Car wuling = CarFactory.getCar("wuling");
        wuling.name();
    }
}
