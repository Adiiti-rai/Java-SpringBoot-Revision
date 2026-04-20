package com.example.stream.questions;

import java.util.*;
import java.util.stream.*;
//Count the Occurrences of Each Element in a List
public class Developer {
    public static void main(String[] args){
        List<String>list= List.of("Apple","Banana","Grapes","Apple","Mango","Banana");
        System.out.println(list);
        Map<String,Long>ans= list.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(ans);

    }
}
