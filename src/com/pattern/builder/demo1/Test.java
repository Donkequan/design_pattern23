package com.pattern.builder.demo1;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build);
    }

}
