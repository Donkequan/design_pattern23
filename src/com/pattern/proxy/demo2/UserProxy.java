package com.pattern.proxy.demo2;

public class UserProxy implements UseService{
    private UserServiceImp userServiceImp;

    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @Override
    public void add() {
        log("1");
        userServiceImp.add();
    }

    @Override
    public void delete() {
        log("2");
        userServiceImp.delete();
    }

    @Override
    public void update() {
        log("4");
        userServiceImp.update();
    }

    @Override
    public void query() {
        log("3");
        userServiceImp.query();
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
