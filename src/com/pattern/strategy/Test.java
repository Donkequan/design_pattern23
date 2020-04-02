package com.pattern.strategy;

public class Test {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        PerkingDuck perkingDuck = new PerkingDuck();
//        perkingDuck.setFlyBehavior(new GoodFlyBehavior());
        perkingDuck.fly();
    }
}
