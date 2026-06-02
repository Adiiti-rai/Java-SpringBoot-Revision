package com.example.multithreading.by.threadclass;

// Performing multiple task from multiple thread using Thread class.
//1. task1= Number task-> print the no from 1 to 5.
//2.task2= CharacterTask-> print the character from A to E.

import java.lang.*;
class NumberTask extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}
class CharacterTask extends Thread{
@Override
    public void run(){
    for(char ch= 'A'; ch<='E';ch++){
        System.out.println(ch);
    }
}
}
 class Main1{
    public static void main(String[] args){
        NumberTask n1= new NumberTask();
        n1.start();
        CharacterTask c1= new CharacterTask();
        c1.start();

    }
}


