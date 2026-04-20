package com.example.exceptionconcepts;

// What is exception?--> An exception is an event, which occurs during the execution of a program,
// that disrupts the normal flow of the program's instructions.

//exception Object->When an error occurs within a method, the method creates an exception object with error details and gives it to the JVM to handle.

//what do you mean by throwing exception?-> Creating an exception object and handing it to the runtime system is called throwing an exception.

//what is exception handling?->Exception Handling in Java is a mechanism used to handle
// both compile-time (checked) and runtime (unchecked) exceptions.

//why we need exception and exception handling?

//what are the advantages of exception handling?
//1. It helps to maintain the normal flow of the application even after an exception occurs.
//2. It provides a way to handle exceptions gracefully and prevent the program from crashing.
//

//what are the keywords used in exception handling?->5 keywords--- try, catch, finally, throw, throws

//what is the error.
//what is types of error?-> there are two types of error-->1.OutOfMemoryError 2.StackOverflowError 2.StackOverflowError
//what is the difference between error and exception?
//what are the types of exception?
//1.Checked exception
//2.Unchecked exception
//what is the difference between checked and unchecked exception?

// Custom exception-->A Custom Exception is a user-defined exception created by the programmer
// to handle specific business logic errors.


//Understand Exception heirarchy
//what is try and catch block?
//try block:- A try block contains the code where exception might occur.
//Nested try block:-
//catch block:- A catch block is used to handle the exception thrown by the try block.catch block will not be executed if their is no exception inside the try block.

// what is multiple catch block?-> Multiple catch blocks are used to handle different types of exceptions that may be thrown by the try block.
// Each catch block can handle a specific type of exception, allowing for more precise error handling.
//==>One try can have multiple catch blocks for different exceptions.

//what is finally block?
//what is throw and throws keyword?
//-> throw:- The throw keyword in Java is used to explicitly create and throw an exception manually.
//It is used inside a method or block
//It throws one exception at a time
//After throw, execution stops immediately
// syntax:- throw new ExceptionType("Error message");


//what is the difference between throw and throws keyword?
//what is nested try-catch block?



//Q--> WRITE THE CODE WHICH THROWS AN ARITHMETIC EXCEPTION
public class ExceptionDemo {
    public static void main(String[] args){
        int x= 10/0;
        System.out.println(x);

    }
}
