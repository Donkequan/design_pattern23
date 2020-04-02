package com.pattern.memento;

public class Originator {

    private String state;

    void getStateFromMemento(Memento memento){
        state = memento.getName();
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
