package com.example.streamquestions;
// find the first no which is greater than 10.

import java.util.*;
import java.util.stream.*;
public class Student {
    public static void main(String[] args){
        List<Integer>list= List.of(50,25,40,10,5,7);
        System.out.println(list);

        int firstNumber= list.stream()
                .filter(n-> n>10)
                .sorted()
                .findFirst()
                        .orElse(0);
        System.out.println(firstNumber);

        //count howMany number are greater than 5

        long count= list.stream()
                .filter(x->x>5)
                .count();
        System.out.println(count);

        // find the sum of all numbers.

        long sum= list.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //find the product of all numbers in the list

        long product= list.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(product);

        // find the sum of even number

        long sumOfEvenNumber= list.stream()
                .filter(x->x%2==0)
                .reduce(0,(a,b)->a+b);
        System.out.println(sumOfEvenNumber);


        // find the maximum number in the list

        int max= list.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(max);
        //or

        int maxNo= list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println(maxNo);

        // sum of square of even number in list
        long result = list.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .reduce(0,(a,b)->a+b);
        System.out.println(result);


// Partition numbers in even and odd list.
        Map<Boolean,List<Integer>>evenoddList= list.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("even"+evenoddList.get(true));
        System.out.println("odd"+evenoddList.get(false));

// count the occurence of each element in a list
        Map<Integer,Long>occurence= list.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(occurence);




    }
}
