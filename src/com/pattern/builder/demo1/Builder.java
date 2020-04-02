package com.pattern.builder.demo1;

public abstract class Builder {

    abstract void buildA();  //第一步
    abstract void buildB();  //第二步
    abstract void buildC();  //第三步

    abstract Product geProduct();
}
