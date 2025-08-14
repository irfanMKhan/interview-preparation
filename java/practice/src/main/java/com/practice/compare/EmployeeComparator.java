package com.practice.compare;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeDTO> {

    @Override
    public int compare(EmployeeDTO o1, EmployeeDTO o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
