package com.pattern.factory.abstract1;

public class HuaFactory implements Factory {
    @Override
    public Router getRouter() {
        return new HuaRouter();
    }

    @Override
    public Phone getPhone() {
        return new HuaPhone();
    }
}
