package com.pattern.prototype.demo2;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("hhh",date);
        System.out.println(v1.hashCode());
        System.out.println(v1.toString());
        Video v2 = (Video) v1.clone();
        System.out.println(v2.hashCode());
        System.out.println(v2.toString());
        date.setTime(12345678);
        System.out.println(v1.hashCode());
        System.out.println(v1.toString());
        System.out.println(v2.hashCode());
        System.out.println(v2.toString());


    }
}
