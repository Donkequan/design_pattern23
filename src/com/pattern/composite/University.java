package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends Organization{

    private List<Organization> organizations = new ArrayList();

    public University(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
        for (Organization organization : organizations) {
            organization.print();
        }
    }

    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }

}
