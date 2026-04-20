package com.example.polymorphismconcepts.runtime;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
     Animal a1 = new Cat();
        a1.sound();
    }
}
