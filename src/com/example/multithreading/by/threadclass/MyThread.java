package com.example.multithreading.by.threadclass;
// performing single task from single thread using thread class.
// Print number from 1 to 5.
import java.lang.*;
class MyThread extends Thread{
 @Override
  public void run(){
   for(int i=1;i<=5;i++){
    System.out.println(i);
   }
  }
}

