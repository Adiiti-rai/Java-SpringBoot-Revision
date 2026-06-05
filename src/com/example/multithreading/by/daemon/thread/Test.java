package com.example.multithreading.by.daemon.thread;


import java.lang.*;
public class Test extends Thread {
    public void run(){
        //System.out.println(Thread.currentThread().isDaemon()); // or
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");
        }
        else{
            System.out.println("child thread");

        }
    }
    public static void main(String[] args){
        System.out.println("Main thread");
        Test t1= new Test();
        t1.setDaemon(true);
        t1.start();

    }
}
// note--> jab tak main thread koi task perform nhi krega tab Daemon thread bhi koi service provide nhi krega.
