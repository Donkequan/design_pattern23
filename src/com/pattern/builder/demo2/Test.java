package com.pattern.builder.demo2;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker
                .buildA("5")
                .buildC("6")
                .build();
        System.out.println(product);
    }
}
