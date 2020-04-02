package com.pattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{

    Department[] departments;
    int numofDart = 0; //保存当前数组对象个数

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("java");
        addDepartment("python");

    }

    @Override
    public String getName() {
        return "computer";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[numofDart] = department;
        numofDart+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
