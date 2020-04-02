package com.pattern.factory.method;

public class WulingFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Wuling();
    }
}
