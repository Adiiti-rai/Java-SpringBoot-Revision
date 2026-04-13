package com.example.streams;
import java.util.stream.*;
import java.util.*;
public class StreamQuestions {
    public static void main(String[] args){
        //1.Remove duplicates from string and return in same order.
        String str= "aabfdcssddf";
        System.out.println(str);

        String result= str.chars()
                .mapToObj(c->(char)c)
                .distinct()
                .map(String::valueOf)
                        .collect(Collectors.joining());
        System.out.println(result);

        //2.Given a sentence find the word that has the highest length.
        String sentence= "Java is a programming language";
        System.out.println(sentence);
        String longWord= Arrays.stream(sentence.split(" "))
                        .max(Comparator.comparing(String::length))
                        .orElse(null);
        System.out.println(longWord);

        //3.Given a sentence find the word that has the 2nd highest length.
        String str1= "Java is a programming language";
        System.out.println(str1);
        String secondLongWord= Arrays.stream(str1.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLongWord);

        //4.Given a sentence find the word that has nth the highest length.
        String str2= "Java is a programming language";
        System.out.println(str2);
        int k=3;
        String highestLengthWord= Arrays.stream(str2.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(k-1)
                .findFirst()
                .orElse(null);
        System.out.println(highestLengthWord);

        // 5.  Find the length of the longest word
        String str3= "Java is a programming language";
        System.out.println(str3);
        int longestWordLength= Arrays.stream(str3.split(" "))
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println(longestWordLength);

        //6.Given a sentence, find the number of occurrence of each word.
        String str4= "My name is Aditi Rai";
        System.out.println(str4);
        Map<String,Long>wordCount= Arrays.stream(str4.split(" "))
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(wordCount);

        //7.Given a word, find the occurrence of Each Character
        String word= "programming";
        System.out.println(word);
        Map<Character,Long>map= word.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(map);

        //8.Given a string, find the words with the maximum number of vowels.
        String str5= "Java is a programming language";
        System.out.println(str5);
        int maxVowelCount= Arrays.stream(str5.split(" "))


    }
}
