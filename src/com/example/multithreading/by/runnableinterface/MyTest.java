package com.example.multithreading.by.runnableinterface;
//Performing single task from multiple thread using Runnable interface.
// print Aditi.

import java.lang.*;
public class MyTest implements Runnable  {
    @Override
    public void run(){
        //How can we prove multiple threads are running
        //Modify the run() method:
        //System.out.println(Thread.currentThread().getName()+": Aditi");
        //imp-->The order is not guaranteed because thread scheduling
        // is controlled by the JVM and OS.
        System.out.println("Aditi");

    }
    public static void main(String[] args){
        MyTest test= new MyTest();
        Thread t1= new Thread(test);
        t1.start();
        Thread t2= new Thread(test);
        t2.start();
        Thread t3= new Thread(test);
        t3.start();
        Thread t4= new Thread(test);
        t4.start();

    }
}
