package com.pattern.decorator;

//调味品
public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public int sumCost() {
        return super.getPrice() + drink.sumCost();
    }

    @Override
    public String getDes() {
        return super.getDes() + drink.getDes();
    }
}
