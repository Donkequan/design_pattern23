package com.pattern.iterator;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<College> colleges = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InforCollege inforCollege = new InforCollege();

        colleges.add(computerCollege);
        colleges.add(inforCollege);

        Output output = new Output(colleges);
        output.printCollege();
    }
}
