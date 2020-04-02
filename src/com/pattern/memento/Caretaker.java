package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList();

    void add(Memento memento){
        this.mementoList.add(memento);
    }

    Memento get(int index){
        return this.mementoList.get(index);
    }
}
