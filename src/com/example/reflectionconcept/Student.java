package com.example.reflectionconcept;

import java.util.*;
 public class Student {
    public String name= "Aditi";
    void display() {
        System.out.println("showing the student information");
    }

    public static void main(String[] args) throws Exception {
        //  writing throws exception because Class.forName() can throw:ClassNotFoundException.
        //method1 using .class
        Class<?>c1= Student.class;

        //method2 using Class.forName()
        //Class<?>c2= Class.forName("Student");-->It gives ClassNotFOund exception..so write the fully qualified name(package+class name)
        Class<?>c2= Class.forName("com.example.reflectionconcept.Student");

        // method3 using .getClass()
        Student s= new Student();
        Class<?>c3= s.getClass();

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getField("name"));

    }
}
