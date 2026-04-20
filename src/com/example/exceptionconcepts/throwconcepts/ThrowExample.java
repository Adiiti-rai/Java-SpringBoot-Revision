package com.example.exceptionconcepts.throwconcepts;

public class ThrowExample {
    public static void main(String[] args){
        int age=15;
        if(age<18){
            throw new ArithmeticException("Age must be at least 18 to vote");
        }
        System.out.println("You are eligible to vote");
    }
}

//throw is used for custom conditions
// It can throw: Built-in exception
//Custom exception
//Code after throw is unreachable
