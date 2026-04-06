package com.example.encapsulationconcepts;
//Encapsulation-->Encapsulation means wrapping data (variables) and methods (functions) into a single unit (class)
// and restricting direct access using access modifiers.
class Student {
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Aditi");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
