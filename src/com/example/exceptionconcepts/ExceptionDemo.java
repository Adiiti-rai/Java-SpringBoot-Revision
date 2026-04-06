package com.example.exceptionconcepts;

// What is exception?--> An exception is an event, which occurs during the execution of a program,
// that disrupts the normal flow of the program's instructions.
//exception Object->When an error occurs within a method, the method creates an exception object with error details and gives it to the JVM to handle.
//what do you mean by throwing exception?-> Creating an exception object and handing it to the runtime system is called throwing an exception.
//what is exception handling?
//why we need exception and exception handling?
//what are the advantages of exception handling?
//what are the keywords used in exception handling?
//what is the error.
//what is types of error?
//what is the difference between error and exception?
//what are the types of exception?
//1.Checked exception
//2.Unchecked exception
//what is the difference between checked and unchecked exception?
// Custom exception
//Understand Exception heirarchy
//what is try and catch block?
// what is multiple catch block?
//what is finally block?
//what is throw and throws keyword?
//what is the difference between throw and throws keyword?
//what is nested try-catch block?



//Q--> WRITE THE CODE WHICH THROWS AN ARITHMETIC EXCEPTION
public class ExceptionDemo {
    public static void main(String[] args){
        int x= 10/0;
        System.out.println(x);

    }
}
