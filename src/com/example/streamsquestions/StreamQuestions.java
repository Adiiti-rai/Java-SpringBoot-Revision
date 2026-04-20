package com.example.streamsquestions;
import java.util.*;
import java.util.stream.*;
public class StreamQuestions {
    public static void main(String[] args){
        List<String>str= List.of("Aditi","abcd","abc","xycsa","xc");
        //33.Group strings by their length
        Map<Integer,List<String>>map= str.stream()
                        .collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        // 35.Group words by first letter
        Map<Character,List<String>>result= str.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(result);

        // 17.find the longest String in the list
        String longest= str.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(longest);

        //18.find the shortest string in the list
        String shortest= str.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(shortest);

        // 5.count the occurrence of each element in the list
        Map<String,Long>count=str.stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(count);

        // 16.join list of string into a single String.
        String singleString= str.stream()
                .collect(Collectors.joining());
        System.out.println(singleString);

        //28. check if list contains duplicate elements.
        boolean hasDuplicates= str.stream()
                .distinct()
                .count() != str.size();
        System.out.println("List contains duplicate elements: " + hasDuplicates);

        //24. convert a List of String into UpperCase.
        List<String>upperCase= str.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);

        // convert list of string to lower case
        List<String>list= str.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(list);



    }
}
