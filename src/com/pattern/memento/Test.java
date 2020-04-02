package com.pattern.memento;

public class Test {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("#1");
        caretaker.add(originator.saveState());
        originator.setState("#2");
        caretaker.add(originator.saveState());
        originator.setState("#3");
        caretaker.add(originator.saveState());

        System.out.println("current:"+originator.getState());

//        恢复到#1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("current:"+originator.getState());


    }

}
