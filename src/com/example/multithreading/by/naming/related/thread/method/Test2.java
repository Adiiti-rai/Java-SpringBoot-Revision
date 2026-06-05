package com.example.multithreading.by.naming.related.thread.method;

public class Test2 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Test2 t1= new Test2();
        t1.start();
        System.out.println("start the thread");
        System.out.println(Thread.currentThread().getName());
        Test2 t2= new Test2();
        t2.start();
        System.out.println("threaddd");
        System.out.println(Thread.currentThread().getName());

    }
}
