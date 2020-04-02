package com.pattern.proxy.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImp userServiceImp = new UserServiceImp();
        UserProxy userProxy = new UserProxy();
        userProxy.setUserServiceImp(userServiceImp);
        userProxy.add();
    }
}
