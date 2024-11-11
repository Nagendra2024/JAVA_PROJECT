package org.nag.java8feature;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {

    public  static void main(String[] args){

        //write a java program, to find all elements from given array and display who starts with 1
       int[] numbers = {1,2,4,8,11,5,21,15};
        List<String> collect = Arrays.stream(numbers)
                .boxed()
                .map(num -> num + "")
                .filter(n -> n.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println(collect);


        // Write a java program and find the longest String given array and display the longest string.
        String[] inputArray = {"Java","CoreJava","Nagendra"};
        String longestString = Arrays.stream(inputArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);

        //Write a java program find first non-repeated character given string.
        String s = "welcometojavaworld";
        String firstNonRepeatedCharacter = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .findFirst().get().getKey();
            System.out.println(firstNonRepeatedCharacter);


            //without java 8 feature to implement first non repeated character
            String s1 = "welcometojavaworld";
            boolean flag = true;
            for(char character:s.toCharArray()){
               if(s1.indexOf(character)==s1.lastIndexOf(character)){
                   System.out.println("There is a first  repeated character  "+character);
                   flag = false;
                   break;
               }
           }
          if(flag){
                System.out.println("There is no repeated character");
          }

          //First Second non repeated character given string
         String input = "welcometojava8feature";
        String key = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .skip(1)
                .findFirst().get().getKey();
        System.out.println(key);

        //Some Aggregation function using reduce method
        List<Integer> listNumner = Arrays.asList(1,3,5);
       int sum = listNumner.stream().mapToInt(n -> n).sum();
       System.out.println(sum);
       int sum1 = listNumner.stream().reduce(0,(a,b)-> a+b);
       System.out.println(sum1);
        Integer i = listNumner.stream().reduce(Integer::sum).get();
        System.out.println(i);


        //This program is used to get duplicate character and count for given string
        String input1 = "WelcomeTOJava";
        List<Map.Entry<String, Long>> duplicateCharacterAndCount = Arrays.stream(input1.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println(duplicateCharacterAndCount);

        //This program is used to get non duplicate character and count for given string
        String input11 = "WelcomeTOJava";
        List<Map.Entry<String, Long>> nonDuplicateCharacterAndCount = Arrays.stream(input11.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a -> a.getValue() == 1)
                .collect(Collectors.toList());
        System.out.println(nonDuplicateCharacterAndCount);

        String[] longestArr = {"java","program","language","development","java"};
        List<Map.Entry<String, Long>> duplicateWordCount = Arrays.stream(longestArr).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(y -> y.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println(duplicateWordCount);


    }

}
