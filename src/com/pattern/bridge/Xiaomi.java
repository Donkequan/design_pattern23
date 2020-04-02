package com.pattern.bridge;

public class Xiaomi implements Branch {
    @Override
    public void info() {
        System.out.println("小米");
    }
}
