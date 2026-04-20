package com.example.exceptionconcepts.throwconcepts;
// Throw-> here i am writing the throw exception.
public class Test {
    public static void main(String[] args){
        int age= -5;
        if(age<0){
            throw new ArithmeticException(("Age cannot be negative"));
        }
        System.out.println("Valid age");

    }
}
