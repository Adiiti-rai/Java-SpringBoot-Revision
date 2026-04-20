package com.example.exceptionconcepts;

public class ClassCastExceptionDemo {
    public static void main(String[] args){
        Object obj= 10;
        String str= (String)obj;
        System.out.println(str);
    }
}
