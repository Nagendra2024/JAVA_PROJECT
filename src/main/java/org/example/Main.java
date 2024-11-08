package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //This program is used to get the each character how many times repeated and there count
        String input = "WelcomeTOJava";
        Map<String, Long> collect = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //Program, to find all elements from given array who starts with 1
        int[] numbers = {1,5,23,11,16,9,15};
        List<String> collect1 = Arrays.stream(numbers)
                .boxed()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect1);

        // Program to find the longest string given an array.
        String[] longestArr = {"java","program","language","development"};
        String s = Arrays.stream(longestArr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println("longest word ::: "+s);

        //Program, to find the second highest number in given arrary
        int[] secondHighestArray = {1,5,23,11,16,9,15};
        Integer secondHighest = Arrays.stream(secondHighestArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second highest number : "+secondHighest);

        //Program to find first non-repeated element from given string
        String nonRepeated = "ilovejavatechhie";
        String fistNonRepeatedElement = Arrays.stream(nonRepeated.split("")).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("First Non Repeated element ::: "+fistNonRepeatedElement);


    }
}