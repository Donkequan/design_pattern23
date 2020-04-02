package com.pattern.strategy;

public class ToyDuck extends Duck {
    public ToyDuck() {
        setFlyBehavior(new NoFlyBehavior());
    }
}
