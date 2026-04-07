package com.example.innerclassconcepts;
//This class demonstrates the concept of Anonymous inner classes in Java
//Anonymous class ka main use:
//abstract method implement karna
//ya method override karna
//without creating separate class

// “Abstract is used because it contains incomplete methods which must be implemented using anonymous class.”
abstract class Animal {
   abstract void sound();
}
public class Person {
    public static void main(String[] args) {
        // Creating an anonymous inner class that extends Animal
        Animal obj = new Animal(){
        void sound () {
            System.out.println("Dog barks");
        }
    };
    obj.sound();
    }
}
