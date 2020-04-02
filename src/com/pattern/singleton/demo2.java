package com.pattern.singleton;

//懒汉式
public class demo2 {

    //私有化构造器
    private demo2(){}
    //类初始化加载对象
    private static demo2 instance;
    //提供获取该对象的方法
    public static synchronized demo2 getInstance(){
        if(instance==null){
            instance = new demo2();
        }
        return instance;
    }
}
