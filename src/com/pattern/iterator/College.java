package com.pattern.iterator;

import java.util.Iterator;

public interface College {

    String getName();

    void addDepartment(String name);

    Iterator createIterator();
}
