package com.example.exceptionconcepts;
//ClassNotFoundException is a checked exception that occurs at runtime when the JVM fails to load a class,
// but the compiler forces us to handle it.
public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("ABC");
    }
}

    //Solution(Handling)->
    //method 1:-try-catch block
// class test{
//   public static void main(String[] args){
//   try{
//     Class.forName("ABC");
//      }
// catch(ClassNotFoundException e){
// System.out.println("Class not found exception is handled");
//}

   //method2: throws keyword->upr likha h code.

