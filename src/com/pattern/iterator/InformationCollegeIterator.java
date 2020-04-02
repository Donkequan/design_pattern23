package com.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class InformationCollegeIterator implements Iterator {

    private List<Department> departments;
    private int index = -1;

    public InformationCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index>=departments.size()-1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }
}
