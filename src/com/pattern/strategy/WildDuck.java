package com.pattern.strategy;

public class WildDuck extends Duck{

    public WildDuck() {
        setFlyBehavior(new GoodFlyBehavior());
    }

}
