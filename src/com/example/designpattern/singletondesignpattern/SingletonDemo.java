package com.example.designpattern.singletondesignpattern;

// LazyIntialization.--> It is not thread Safe .
import java.util.*;
public class SingletonDemo {
    //static instance variable----
    private static SingletonDemo instance;

    //private constructor
    private SingletonDemo() {
        System.out.println("create the singleton object");
    }
    //public static method---provide the global access method

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo obj = SingletonDemo.getInstance();
        SingletonDemo obj1 = SingletonDemo.getInstance();
        System.out.println(obj == obj1);

    }
}

