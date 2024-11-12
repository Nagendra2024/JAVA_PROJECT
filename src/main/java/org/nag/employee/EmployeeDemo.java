package org.nag.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDemo {
    
    public static void main(String[] args) {

        long startTime=0;
        long endTime=0;
        List<Employee> employees = EmployeeDataBase.getEmployees();
        System.out.println("\n"+"Employees:"+employees);
        startTime = System.currentTimeMillis();
        double normalStreamexecution = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        endTime = System.currentTimeMillis();
        System.out.println("Normal stream execution :  "+(endTime-startTime)+"   Average salary :"+normalStreamexecution);



        startTime = System.currentTimeMillis();
        double parallelStreamExecution = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel stream execution :   "+(endTime-startTime)
                + "  Average salary :"+parallelStreamExecution);


        int[] input = {1,32,12,32,16};
        List<String> collect = Arrays.stream(input).boxed().map(i -> i + "")
                .filter(s -> s.endsWith("0"))
                .collect(Collectors.toList());

        System.out.println(collect);

        String[] inputStr = {"java","webdeveloper","nagendra","java"};

        Map<String, Long> collect1 = Arrays.stream(inputStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
        List<Map.Entry<String, Long>> collect2 = Arrays.stream(inputStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).collect(Collectors.toList());
        System.out.println(collect2);


    }
}
