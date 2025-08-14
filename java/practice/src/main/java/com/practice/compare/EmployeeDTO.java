package com.practice.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO implements Comparable<EmployeeDTO> {
    private String name;
    private String department;
    private Long Salary;

    @Override
    public int compareTo(EmployeeDTO employeeDTO) {
        return this.Salary.compareTo(employeeDTO.getSalary());
    }

}
