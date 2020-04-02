package com.pattern.singleton;

//饿汉式改进。静态内部类
public class demo4 {

    private demo4(){}

    private static class InnerClass{
        private static final demo4 instance = new demo4();
    }

    public static demo4 getInstance(){
        return InnerClass.instance;
    }
}
