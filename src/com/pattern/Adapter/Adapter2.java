package com.pattern.Adapter;

//适配器
//对象适配器
public class Adapter2 implements NetUSB {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void handle() {
        adaptee.request(); //可以上网了
    }
}
