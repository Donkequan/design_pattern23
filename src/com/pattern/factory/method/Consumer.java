package com.pattern.factory.method;

public class Consumer {

    public static void main(String[] args) {
        Car tesla = new TeslaFactory().getCar();
        tesla.name();
        Car wuling = new WulingFactory().getCar();
        wuling.name();
    }
}
