package com.example.stream.questions;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args){
        //Count the Occurrences of Each Character in a String

        String str= "Hello";
        System.out.println(str);
        Map<Character,Long>ans= str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(ans);
    }
}
