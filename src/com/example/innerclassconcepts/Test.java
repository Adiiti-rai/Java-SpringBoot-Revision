package com.example.innerclassconcepts;
// This class demonstrates the concept of static inner classes in Java.

import java.sql.SQLOutput;

class OuterDemo{
    int a=10;
    static int b=20;
    void show(){
        System.out.println("This is the outer class method");
    }
    static void m1(){
        System.out.println("This is the static method of the outer class");
    }
    static class InnerDemo{
        void display(){
            System.out.println("This is the inner class method");
        }
        static int c=50;
        static void m2() {
            System.out.println("This is the static method of the inner class");
            System.out.println("Accessing static variable of inner class: " + c);
            System.out.println("Accessing static variable of outer class: " + b);
            System.out.println("Calling static method of outer class:");
            m1();
        }
    }

}
public class Test {
    public static void main(String[] args){
        OuterDemo outobj= new OuterDemo();
        outobj.show();
        OuterDemo.m1();
        OuterDemo.InnerDemo inObje= new OuterDemo.InnerDemo();
        inObje.display();
        OuterDemo.InnerDemo.m2();
    }
}
