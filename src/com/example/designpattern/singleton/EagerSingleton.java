package com.example.designpattern.singleton;

// Eager intialization--“Eager initialization is thread-safe but creates the object at class loading time,
// which may lead to unnecessary memory usage if the object is never used.”
import java.util.*;
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("object is created");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton obj = EagerSingleton.getInstance();
        EagerSingleton obj1 = EagerSingleton.getInstance();

        System.out.println(obj==obj1);
    }
}
