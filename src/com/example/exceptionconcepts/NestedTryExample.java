package com.example.exceptionconcepts;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            System.out.println("outer try block");
            // This will throw ArrayIndexOutOfBoundsException
            try {
                int a = 10;
                int b = 0;
                //Arithmetic exception
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error:" + e.getMessage());
            }
        int[] arr = new int[5];
        arr[10] = 100;
    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: Array index error:"+e.getMessage());
        }

        System.out.println("program continues...");
    }
}
