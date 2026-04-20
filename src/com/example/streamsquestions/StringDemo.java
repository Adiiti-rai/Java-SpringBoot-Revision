package com.example.streamsquestions;
// here  I am solving the stream questions related to string.

import java.util.*;
import java.util.stream.*;
public class StringDemo {
    public static void main(String[] args){
        String str= "aabbcdeeff";
        System.out.println("Original string: " + str);
        // find the first non-repeating character in a string.
        Character result= str.chars()
                .mapToObj(c->(char)c)
                .filter(ch->str.indexOf(ch)== str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println("First non-repeating character: " + result);

        // Find the frequency of each character in a string.
        Map<Character,Long>map= str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println("Frequency of each character: " + map);




    }
}
