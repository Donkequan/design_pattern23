package com.pattern.flyweight;

public class ConcreteWebsite implements AbstractWebsite {

    private String type; //网站类型

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("using "+ this.type + user.toString());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
