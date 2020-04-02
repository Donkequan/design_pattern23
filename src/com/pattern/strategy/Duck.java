package com.pattern.strategy;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
