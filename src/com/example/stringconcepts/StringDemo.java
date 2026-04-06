package com.example.stringconcepts;

public class StringDemo {
    public static  void main(String[] args){
        String s1= "Aditi"; //using String Literal
        String s2= new String("Aditi"); // using new Keyword.
        System.out.println("s1:"+ s1);
        System.out.println("s2:"+s2);
    }
}

// what is Strings?
// Why Strings are Immutable ?
// Importance of String constant pool and Heap area during
// object initialization in String? explain

// String is an object.It is a sequence of character and every character is stored in 16 bits.
//There are two ways to creating String---
//1.String Literal---- It is stored in String constant pool which is the part of Heap.
//2.Using new Keyword.------

//Strings are immutable Beacuse of
// 1.Security
//2. It improves the efficiency of  String Constant pool.
//3. Thread safety.
//4. caching
//------------------------
//String Constant pool:- It is a special memory area inside
//the heap which is store the String literals to avoid duplicate objects.




