package com.pattern.strategy;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
