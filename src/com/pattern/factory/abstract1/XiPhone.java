package com.pattern.factory.abstract1;

public class XiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("XiCall");
    }

    @Override
    public void sendMes() {
        System.out.println("XiSend");
    }
}
