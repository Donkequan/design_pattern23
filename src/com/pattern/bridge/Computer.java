package com.pattern.bridge;

public abstract class Computer {

    private Branch branch;

    public Computer(Branch branch){
        this.branch = branch;
    }

    public void info(){
        branch.info();
    }
}

class Desktop extends Computer{

    public Desktop(Branch branch) {
        super(branch);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Branch branch) {
        super(branch);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}
