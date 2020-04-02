package com.pattern.decorator;

public abstract class Drink {

    private String des;
    private int price;

    public abstract int sumCost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
