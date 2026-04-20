package com.example.accessmodifiersconcepts;
//Access Modifiers-->Access Modifiers are keywords used to control the
// visibility (accessibility) of classes, variables, methods, and constructors.

//Types of access modifiers in java-->4 types of access modifiers in java
//private, default, protected, public

//1. private:-Accessible only within same class
public class Student {
    private int x=10;
    void show(){
        System.out.println(x);
    }
}

//2.default:-Accessible within same package only
class Test {
    int x = 20;

    void show() {
        System.out.println(x);
    }
}

//3. protected:-Accessible within same package and outside the package through inheritance only
class Parent {
    protected int x = 30;
}

class Child extends Parent {
    void show() {
        System.out.println(x); // allowed
    }
}

//4.public:-Accessible from anywhere
  class Test1 {
    public int x = 40;
}