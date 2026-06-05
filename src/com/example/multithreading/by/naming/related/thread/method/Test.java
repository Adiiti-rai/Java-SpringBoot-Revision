package com.example.multithreading.by.naming.related.thread.method;

import java.lang.*;
public class Test extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        System.out.println("Main Thread");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Aditi");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t1.isAlive());

    }
}
