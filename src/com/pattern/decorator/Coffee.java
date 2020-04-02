package com.pattern.decorator;

public class Coffee extends Drink {

    @Override
    public int sumCost() {
        return super.getPrice();
    }
}
