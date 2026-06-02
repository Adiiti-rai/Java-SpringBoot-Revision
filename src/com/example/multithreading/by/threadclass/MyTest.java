package com.example.multithreading.by.threadclass;

//Performing single task from multiple thread using thread class.
// Print the Hello.
import java.lang.*;
public class MyTest extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+": Hello");
        //System.out.println("Hello");
    }

    public static void main(String[] args){
        MyTest t1= new MyTest();
        t1.start();
        MyTest t2= new MyTest();
        t2.start();
        MyTest t3= new MyTest();
        t3.start();
        MyTest t4= new MyTest();
        t4.start();
    }
}
