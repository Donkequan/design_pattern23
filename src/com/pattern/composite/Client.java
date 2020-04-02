package com.pattern.composite;

public class Client {

    public static void main(String[] args) {
        Organization university = new University("xjtlu");

        Organization college1 = new College("CSSE");
        Organization depart1 = new Department("CS");
        Organization depart2 = new Department("EE");

        Organization college2 = new College("IBSS");
        Organization depart3 = new Department("IB");
        Organization depart4 = new Department("BS");

        university.add(college1);
        university.add(college2);

        college1.add(depart1);
        college1.add(depart2);
        college2.add(depart3);
        college2.add(depart4);

        university.print();
    }
}
