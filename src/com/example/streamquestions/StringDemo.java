package com.example.streamquestions;
import java.util.*;
import java.util.stream.*;
public class StringDemo {
    public static void main(String[] args){
        List<String>list= List.of("Aditi", "hari","Ram","Shyam","Radha","Bharti","Ankit");
        System.out.println(list);
       //group a list of words by their length using stream.

        Map<Integer,List<String>>ans= list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(ans);
    }

}
