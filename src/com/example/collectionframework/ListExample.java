package com.example.collectionframework;

//Collection framework:- It is a set of classes and interfaces that provide a way to store and manipulate groups of objects.
// It includes various data structures such as lists, sets, maps, and queues.
//Collection Interface:- It is the root interface in the collection hierarchy.
// It defines basic operations for adding, removing, and querying elements in a collection.
//-------------------------------------------------------------------------------
//List Interface:- It is a sub interface of the Collection interface.
// List is the part of java.util.package.
//It represents ordered collection,allow duplicates elements,allows null values and List has four implementation classes:-
//1.ArrayList
//2.LinkedList
//3.Vector
//4.Stack

// Here I am using ArrayList class which is the implementation of List interface.
// and write a program to demonstrate the various methods of List interface.
import java.util.*;
public class ListExample {
    public static void main(String[] args){
        List<Integer>list= new ArrayList<>();
        //add elements
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(5);
        System.out.println("print the list:"+list);
// get element
        System.out.println("get the element at index 2:"+list.get(2));
        System.out.println("get the element at index 0:"+list.get(0));

        //update element--->set(int index,E element)
        list.set(0,1);
        list.set(4,25);
        System.out.println("print the list after updating the list:"+list);

        //remove elemnt---> remove(int index) or remove(object o)
        list.remove(0);
        System.out.println("print the list after removing the element at 0 index:"+list);
        list.remove(Integer.valueOf(25));
        System.out.println("print the list after removing the element 25:"+list);

        // size()
        System.out.println("print the size of the list:"+list.size());

        // isEmpty()
        System.out.println("check the list is empty or not:"+list.isEmpty());

        //contains(object o)
        list.contains(15);
        System.out.println("check the list contains 15 or not:"+list.contains(15));
        //indexOf(Object o)//the index of the first occurrence of the element
        System.out.println("print the index of 10:"+list.indexOf(15));
        //lastIndexOf(Object o)//the index of the last occurrence of the element
        System.out.println("print the last index of the list:"+list.lastIndexOf(20));
    }


}

