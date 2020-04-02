package com.pattern.Adapter;

public class Computer {

    public void net(NetUSB adapter){
        adapter.handle();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adapter adapter = new Adapter();
        Adapter2 adapter2 = new Adapter2(new Adaptee());
        computer.net(adapter2);
    }
}
