package com.pattern.visitor;

public class Fail extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("man fail");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("woman fail");
    }
}
