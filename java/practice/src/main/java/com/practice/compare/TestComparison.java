package com.practice.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparison {
    public static void main(String[] args) {

        List<EmployeeDTO> list = new ArrayList<>();

        EmployeeDTO e1 = new EmployeeDTO("emp1", "dept1", 300L);
        EmployeeDTO e2 = new EmployeeDTO("emp2", "dept2", 200L);

        list.add(e1);
        list.add(e2);

        /* Using comparable */
        Collections.sort(list);
        list.forEach(l -> System.out.println(l.getName()));

        /* Using comparator */
        list.sort(new EmployeeComparator());
        list.forEach(l -> System.out.println(l.getName()));

    }
}
