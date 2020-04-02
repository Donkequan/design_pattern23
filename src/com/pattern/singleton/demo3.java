package com.pattern.singleton;

//DCL懒汉式
public class demo3 {
    //私有化构造器
    private demo3(){}
    //类初始化加载对象
    private volatile static demo3 instance;
    //提供获取该对象的方法
    public static demo3 getInstance(){
        if(instance==null){
            synchronized (demo3.class){
                if(instance==null) {
                    instance = new demo3();
                }
            }
        }
        return instance;
    }
}
