package com.example.innerclassconcepts;
//This class demonstrates the concept of Local inner classes in Java.
//“Local inner class cannot be accessed outside the method in which it is defined,
// so its object must be created within that method.”
class OuterClass{
    int a= 10;
    static int b=20;
    void display(){
        class LocalInnerClass{
            void show(){
                System.out.println("Value of a: "+a);
                System.out.println("Value of b: "+b);
            }
        }
        LocalInnerClass localInnerClass= new LocalInnerClass();
        localInnerClass.show();
    }
}

public class Employee {
    public static void main(String[] args){
        OuterClass outerClass= new OuterClass();
        outerClass.display();
    }
}
