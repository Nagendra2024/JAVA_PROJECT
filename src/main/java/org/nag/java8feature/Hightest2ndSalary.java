package org.nag.java8feature;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hightest2ndSalary {

    public  static void main(String[] args) {
//Approach 1
        Map<String,Integer> mapList =  new HashMap<>();
        mapList.put("A",1000);
        mapList.put("B",2000);
        mapList.put("C",3000);
        mapList.put("D",5000);
        mapList.put("E",8000);
        mapList.put("F",10000);
        mapList.put("G",20000);
        mapList.put("H",30000);
        mapList.put("I",40000);

        /*Map.Entry<String, Integer> stringIntegerEntry = mapList.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(1);*/

        System.out.println("Approach 1 - Second Highest Salary:: "+find2ndHighestSalary(5,mapList));

        Map<String,Integer> mapList1 =  new HashMap<>();
        mapList1.put("A",1000);
        mapList1.put("B",2000);
        mapList1.put("C",1000);
        mapList1.put("D",5000);
        mapList1.put("E",2000);
        mapList1.put("F",3000);
        mapList1.put("G",2000);
        mapList1.put("H",3000);
        mapList1.put("I",1000);

        Map.Entry<Integer, List<String>> map2 = mapList1.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1);
        System.out.println(map2);


        System.out.println("Approach 2 - Second Highest Salary:: "+findDynamicHighestSalary(2,mapList1));






    }
//Approach 1 - it will work partially, when having unique element
    public static Map.Entry<String, Integer> find2ndHighestSalary(int num,Map<String, Integer> mapList){
        return mapList.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(num - 1);
    }
//Approach - 2 This will work all scenarios
    public static Map.Entry<Integer, List<String>> findDynamicHighestSalary(int num,Map<String, Integer> mapList1){
        return mapList1.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num-1);
    }
}
