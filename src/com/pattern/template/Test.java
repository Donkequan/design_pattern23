package com.pattern.template;

public class Test {
    public static void main(String[] args) {
        Milk milk = new RedMilk();
        milk.make();

        Milk milk1 = new BlackMilk();
        milk1.make();

        Milk milk2 = new WhiteMilk();
        milk2.make();
    }
}
