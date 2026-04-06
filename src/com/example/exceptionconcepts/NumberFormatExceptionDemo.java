package com.example.exceptionconcepts;

public class NumberFormatExceptionDemo {
    public static void main(String[] args){
        String str="abc";
        int val= Integer.parseInt(str);
        System.out.println(val);
    }
}
