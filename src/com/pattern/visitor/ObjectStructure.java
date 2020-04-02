package com.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    //维护集合
    private List<Person> people = new LinkedList<Person>();

    public void attach(Person person){
        people.add(person);
    }

    public void remove(Person person){
        people.remove(person);
    }

    public void diplay(Action action){
        for (Person person : people) {
            person.accept(action);
        }
    }
}
