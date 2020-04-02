package com.pattern.template;

public abstract class Milk {

    final void make(){
        select();
        if (add()){
            addCondiments();
        }
        soak();
    }

    void select(){
        System.out.println("first");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("third");
    }

    boolean add(){
        return true;
    }
}
