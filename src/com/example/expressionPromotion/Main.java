package com.example.expressionPromotion;

public class Main {
    public static void main(String[] args){
        byte a= 10;
        byte b=20;
        //byte c= a+b;-->this is wrong
        byte c=(byte)(a+b); // this is right but the best way is:-
        System.out.println(c);
        int result= a+b;
        System.out.println(result); // this is best way.

        //Whenever arithmetic operations (+, -, , /) are performed, byte, short,
        // and char are automatically promoted to int
    }
}
