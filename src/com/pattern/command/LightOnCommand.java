package com.pattern.command;

public class LightOnCommand implements Commend{

    private LightReceiver light;

    public LightOnCommand(LightReceiver light){
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
