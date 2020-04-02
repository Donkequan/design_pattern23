package com.pattern.singleton;

//饿汉式单例
public class demo1 {
    //建了就有
    private byte[]  data1 = new byte[1024];

    //私有化构造器
    private demo1(){}
    //类初始化加载对象
    private static demo1 instance  = new demo1();
    //提供获取该对象的方法
    public static demo1 getInstance(){
        return instance;
    }
}

