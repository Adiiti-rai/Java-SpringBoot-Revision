package com.example.exceptionconcepts;
// here I am writing the classCastException through the real life example.
public class Employee {
    String name;
    public static void main(String[] args){
        Employee emp= new Manager();
        Developer dev= (Developer)emp;
    }
}
class Manager extends Employee{
    void manage(){
        System.out.println("Managing the team");
    }
}
class Developer extends Employee{
    void code(){
        System.out.println("developer writes the code");
    }
}


