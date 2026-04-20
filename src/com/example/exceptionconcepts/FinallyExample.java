package com.example.exceptionconcepts;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int a = 10;
            int b = 0;
            int result = a + b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error:" + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("Program continues...");
    }
}
