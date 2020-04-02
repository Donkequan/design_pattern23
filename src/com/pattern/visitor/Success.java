package com.pattern.visitor;

public class Success extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("man success");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("woman success");
    }
}
