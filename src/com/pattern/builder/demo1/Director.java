package com.pattern.builder.demo1;

//指挥者
public class Director {

    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.geProduct();
    }
}
