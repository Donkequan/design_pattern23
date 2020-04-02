package com.pattern.strategy;

public class PerkingDuck extends Duck{
    public PerkingDuck() {
        setFlyBehavior(new BadFllyBehavior());
    }
}
