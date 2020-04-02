package com.pattern.bridge;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Laptop(new Huawei());
        computer.info();
    }
}
