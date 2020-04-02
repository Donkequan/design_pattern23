package com.pattern.decorator;

public class CoffeeBar {


    public static void main(String[] args) {
        Drink meishi = new Meishi();
        System.out.println(meishi.getDes());

        meishi = new Milk(meishi);
        System.out.println(meishi.getDes());


    }
}
