package com.pattern.prototype.demo1;

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
    }
}
