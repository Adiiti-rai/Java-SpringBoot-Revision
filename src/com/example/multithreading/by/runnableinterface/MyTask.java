package com.example.multithreading.by.runnableinterface;
// performing single task from single thread using Runnable interface.

// Print number from 0 to 5.
import java.lang.*;
public class MyTask implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}
