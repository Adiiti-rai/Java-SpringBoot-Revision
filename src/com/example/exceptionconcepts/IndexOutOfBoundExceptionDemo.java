package com.example.exceptionconcepts;

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args){
        // here I am writing the code for index out of bound exception using array.
        int[]arr= new int[2];
        System.out.println(arr[3]);

        // here I am writing the code for index out of bound exception using string.
        String str= "Aditi";
        System.out.println(str.charAt(10));
    }
}
