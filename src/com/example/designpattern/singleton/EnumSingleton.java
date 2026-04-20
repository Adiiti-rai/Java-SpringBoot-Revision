package com.example.designpattern.singleton;

//using enum-->object internally create hota h ->hum keval use krte h->it is thread saftey and singlton using enum can't break using reflection ,cloning,serialization.
public enum EnumSingleton {
    INSTANCE;

    public void showMethod(){
        System.out.println("hello from singleton");
    }

    public static void main(String[] args){
        EnumSingleton obj= EnumSingleton.INSTANCE;
        obj.showMethod();
        EnumSingleton obj1= EnumSingleton.INSTANCE;

        System.out.println(obj== obj1);
    }
}