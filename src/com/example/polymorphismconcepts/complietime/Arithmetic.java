package com.example.polymorphismconcepts.complietime;

public class Arithmetic {
    int sum(int a,int b){
        return (a+b);
    }
    int sum(int a,int b,int c){
        return(a+b+c);
    }
    public static void main(String[] args){
        Arithmetic obj1= new Arithmetic();
        int a= obj1.sum(10,20);
        int b= obj1.sum(10,20,30);
        System.out.println("sum1:"+a);
        System.out.println("sum2:"+b);
    }
}