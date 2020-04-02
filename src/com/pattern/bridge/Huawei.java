package com.pattern.bridge;

public class Huawei implements Branch{
    @Override
    public void info() {
        System.out.println("华为");
    }
}
