package com.pattern.factory.abstract1;

public class HuaPhone implements Phone {
    @Override
    public void call() {
        System.out.println("HuaCall");
    }

    @Override
    public void sendMes() {
        System.out.println("HuaSend");
    }
}
