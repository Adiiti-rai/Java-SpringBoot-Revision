package com.example.stream.questions;
import java.util.*;
import java.util.stream.*;
public class Employee {
    public static void main(String[] args){
        //Count the Occurrences of Each Word in a String
        String word= "hello world hello";
        System.out.println(word);

        Map<String,Long> ans= Arrays.stream(word.split(" "))
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(ans);


    }
}
