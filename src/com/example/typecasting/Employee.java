package com.example.typecasting;

public class Employee {
    public static void main(String[] args){
        //convert string into char of array
        String str= "Hello";
        char[] chArr= str.toCharArray();
        for(char ch:chArr){
            System.out.println(ch);
        }

        // convert char[] into String
        char[] arr= {'A','B','C','D'};
        String str1=new String(arr);
        System.out.println(str1);
    }
}
