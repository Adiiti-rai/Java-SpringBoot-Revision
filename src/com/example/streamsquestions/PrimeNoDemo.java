package com.example.streamsquestions;
// in a list find the prime no list.
import java.util.*;
import java.util.stream.*;
public class PrimeNoDemo {
    public static void main(String[] args){
        List<Integer>list= List.of(1,2,4,3,7,5,9,8);
        System.out.println(list);
        List<Integer>primeList= list.stream()
                .filter(num-> num>1 && IntStream.range(2,num).noneMatch(i->num%i==0))
                        .collect(Collectors.toList());

        System.out.println(primeList);
    }




}
