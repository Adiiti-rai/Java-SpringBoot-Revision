package com.example.expression.promotion;


//byte, short, and char are always promoted to int during arithmetic operations
public class TypePromotionDemo {
    public static void main(String[] args){
        int a=10;
        double b=20;
        double result= a+b;
        System.out.println(result);

        int x=5;
        float y= 0.5f;
        long z=100L;
        double result1= x+y+z;
        System.out.println(result1);

        //char promotion
        char ch1='A';
        char ch2='B';
        int charResult= ch1+ch2;
        System.out.println(charResult);

        //special case:-- you can use casting
        byte u=10;
        byte v=20;
       // byte s= (byte)(u*v);
        //or
        int s= u*v;
        System.out.println(s);

    }
}
