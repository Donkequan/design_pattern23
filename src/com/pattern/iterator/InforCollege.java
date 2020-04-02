package com.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InforCollege implements College{

    private List<Department> departments;

    public InforCollege() {
        this.departments = new ArrayList<Department>();
        addDepartment("EE");
        addDepartment("BS");
    }

    @Override
    public String getName() {
        return "information";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departments);
    }
}
