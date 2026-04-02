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
    }
}
