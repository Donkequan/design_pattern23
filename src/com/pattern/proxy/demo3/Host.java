package com.pattern.proxy.demo3;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房");
    }

}
