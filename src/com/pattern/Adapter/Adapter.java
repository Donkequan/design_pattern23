package com.pattern.Adapter;

//适配器
//类适配器
public class Adapter extends Adaptee implements NetUSB {
    @Override
    public void handle() {
        super.request(); //可以上网了
    }
}
