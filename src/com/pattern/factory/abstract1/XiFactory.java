package com.pattern.factory.abstract1;

public class XiFactory implements Factory {
    @Override
    public Router getRouter() {
        return new XiRouter();
    }

    @Override
    public Phone getPhone() {
        return new XiPhone();
    }
}
