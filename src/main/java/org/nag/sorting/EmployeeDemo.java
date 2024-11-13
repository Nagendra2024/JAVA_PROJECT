package org.nag.sorting;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeDatabase.getEmployees();
        System.out.println(employees);

        List<Employee> a = employees.stream().filter(e -> e.getDepartmentId().equals("A") && e.getEmpSalary()>10000).collect(Collectors.toList());

    System.out.println(a);
    }
}
