package com.example.streams;
import java.util.*;
import java.util.stream.*;
public class App {
    public static int count_vowel(String str) {
        int count = 0;
        String s = "aeiouAEIOU";
        for (char ch : str.toCharArray()) {
            if (s.contains(ch + "")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String string= "My name is Aditi Rai";
        System.out.println(string);
        String result= Arrays.stream(string.split("\\s+"))
                .max(Comparator.comparing(App::count_vowel))
                .orElse(null);
        System.out.println(result);





        }
    }

