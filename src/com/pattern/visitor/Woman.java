package com.pattern.visitor;

public class Woman extends Person{
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
