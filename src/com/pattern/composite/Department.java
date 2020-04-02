package com.pattern.composite;

public class Department extends Organization{


    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
