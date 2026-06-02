package com.example.multithreading.by.runnableinterface;

import java.lang.*;
public class MyTask implements Runnable {
    @Override
    public void run(){
        System.out.println("thread is running");
    }
}
