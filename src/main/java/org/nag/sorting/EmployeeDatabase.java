package org.nag.sorting;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {


    public static List<Employee> getEmployees() {
        Employee e1 = new Employee(100,"babu","A",10000);
        Employee e2 = new Employee(102,"sudha","C",25000);
        Employee e3 = new Employee(105,"nagendra","B",43000);
        Employee e4 = new Employee(104,"sowjanya","B",55000);
        Employee e5 = new Employee(103,"raju","A",15000);
        return Arrays.asList(e1,e2,e3,e4,e5);

    }



}
