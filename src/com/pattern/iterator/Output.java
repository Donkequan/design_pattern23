package com.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class Output {

    List<College> colleges;

    public Output(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege(){
        for (College college : colleges) {
            System.out.println(college.getName());
            printDepart(college.createIterator());
        }
    }

    public void printDepart(Iterator iterator){
        while(iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
