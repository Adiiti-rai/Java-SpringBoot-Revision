package com.example.constructorDemo;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aditi");
        s1.display();
    }
}
