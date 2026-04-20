package com.example.designpattern.singleton;

// using synchronised -- thread safety..--- It is a thread safe but is slower.
public class SingletonSynchronised {

    private static SingletonSynchronised instance;

    private SingletonSynchronised(){
        System.out.println("object is created");
    }

    public static synchronized SingletonSynchronised getInstance(){
        if(instance== null){
            instance= new SingletonSynchronised();
        }
        return instance;
    }

    public static void main(String[] args){
        SingletonSynchronised obj= SingletonSynchronised.getInstance();
        SingletonSynchronised obj1= SingletonSynchronised.getInstance();
        System.out.println(obj==obj1);
    }
}