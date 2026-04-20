package com.example.innerclassconcepts;
// This class demonstrates the concept of  Instance inner classes in Java.
 class Outer {
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("This is the method of outer class");
    }
    static void m2(){
        System.out.println("This is the static method of outer class");
    }
    class Inner{
        int x=11;
        void show(){
            System.out.println("This is the method of inner class");
            System.out.println("Value of a:"+a);
            System.out.println("Value of b:"+b);
            m1();
            m2();
        }
    }
}

public class Student{
     public static void main(String[] args){
         Outer o1= new Outer();
         o1.m1();
         o1.m2();
         Outer.Inner inObj= o1.new Inner();
         inObj.show();
    }
}
