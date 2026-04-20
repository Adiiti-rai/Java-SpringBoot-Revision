package com.example.exceptionconcepts.throwconcepts;
// here i m writing the example using try-catch block

public class ThrowExample1 {
    public static void main(String[] args){
        try{
            int age= 10;

            if(age<18){
                throw new ArithmeticException("Age must be 18 or above to vote");

            }
            System.out.println("You are eligible to vote");

        }
        catch(ArithmeticException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
         System.out.println("Program continues...");
    }
}
