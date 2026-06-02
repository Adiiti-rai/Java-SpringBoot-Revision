package com.example.multithreading.by.runnableinterface;

public class Main {
    public static void main(String[] args){
        MyTask task= new MyTask();
        Thread t1= new Thread(task);
        t1.start();
        System.out.println("Main thread");
    }
}
