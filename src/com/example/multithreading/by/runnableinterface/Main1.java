package com.example.multithreading.by.runnableinterface;
// Performing multiple task from multiple thread using Runnable interface.
//1. task1= Number task-> print the no from 1 to 5.
//2.task2= CharacterTask-> print the character from A to E.

class NumberTask implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class CharacterTask implements Runnable{
    @Override
    public void run(){
        for(char ch='A';ch<='E';ch++){
            System.out.println(ch);
        }
    }
}

public class Main1 {
    public static void main(String[] args){
        NumberTask numberTask= new NumberTask();
        Thread t1= new Thread(numberTask);
        t1.start();

        CharacterTask characterTask= new CharacterTask();
        Thread t2= new Thread(characterTask);
        t2.start();

    }
}
