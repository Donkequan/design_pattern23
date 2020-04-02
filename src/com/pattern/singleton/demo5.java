package com.pattern.singleton;

//枚举单例
public enum demo5 {
    INSTANCE;

    public static demo5 getInstance(){
        return INSTANCE;
    }

}
