package com.example.multithreading.by.thread.priorities;

import java.lang.*;
public class Test extends Thread {
    public void run(){
        System.out.println("thread is running");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority());
        Test t1= new Test();
        t1.start();

    }
}
//Note :- main thread se koi bhi dusra thread create hoga uski priority main thread
// ke according hi hogi..like main thread priority
// 5 h to created thread ki priority bhi 5 hogi jo main thread se create hui h.
