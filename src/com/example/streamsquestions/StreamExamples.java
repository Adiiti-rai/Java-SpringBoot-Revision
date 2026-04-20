package com.example.streamsquestions;
import java.util.*;
import java.util.stream.*;
public class StreamExamples {
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 3, 5, 6, 8, 7);
        System.out.println("print the list:" + list);
        // print the even number
        List<Integer> result = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("print the even number:" + result);
// print odd number
        List<Integer> result1 = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("print the odd number:" + result1);

        // print max no
        int maxNo = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("print the max no:" + maxNo);

        //print min no
        int minNo= list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
        System.out.println("Print the minimum no of the list:"+minNo);

        // sum of all digit in the list
        long sum= list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("print the sum of all digit in the list:"+sum);

        // find the product of all elements
        long product= list.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println("print the product of all elements in the list:"+product);

        // print the avg of all elements in the list
        double avg= list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("print the avg of all elements in the list:"+avg);

        //Count the Number of Elements in a List
        Long count= list.stream()
                .count();
        System.out.println("print the count of all elements in the list:"+count);

        // Check if a List Contains a Specific Element
        boolean result2= list.stream()
                .anyMatch(x->x==3);
        System.out.println("print the result of anyMatch:"+result2);

        // Find the First Element in a List
        int firstElement= list.stream()
                .findFirst()
                .orElse(0);
        System.out.println("print the first element in the list:"+firstElement);

        //Find the last Element in a List
        int lastElement= list.stream()
                .reduce((a,b)->b)
                        .orElse(0);
        System.out.println("print the last element in the list:"+lastElement);
    }
}
