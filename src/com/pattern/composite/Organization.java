package com.pattern.composite;

public abstract class Organization {

    private String name;

    public Organization(String name) {
        this.name = name;
    }

    public void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization){
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


