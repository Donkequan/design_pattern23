package com.pattern.strategy;

public class BadFllyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("bad Fly");
    }
}
