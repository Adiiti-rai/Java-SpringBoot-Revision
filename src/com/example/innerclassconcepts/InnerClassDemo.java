package com.example.innerclassconcepts;
// Inner class:-When you define a class within another class then it is called as inner class or nested class.
//eg-> class Outer{
//        .......
//      class Inner{
//        .......
//      }
//     }

//Why we use Inner Class-----
//To group related classes together
//To improve readability
//To access private members of outer class easily

// Inner class can access private variables of outer class
//Outer class cannot directly access inner class members  (needs object)
//Types of Inner Class:-
//1. Non-static Inner Class or Instance Inner Class--> When you define a class within another class
// without static modifier is called as instance inner class.
//Syntax:--
//Outer.Inner outobj= new Outer().new Inner();
//or-> Outer outobj= new Outer();
// Outer.Inner inObj= outObj.new Inner();

//2. Static Inner Class or Static Nested Class:- When you define a class within another class
// with static modifier is called as instance inner class.
//Syntax:--Outer.Inner outObj= new Outer.Inner();

//3. Local Inner Class:-- When you define a class within a method, block or constructors is called as local inner class.
//Syntax:--


//4. Anonymous Inner Class:-- When you define a class without name is called as anonymous inner class.
// It is declared and instantiated at the same time
//Used when you need a class only once
//An anonymous inner class is a class without a name that is used to
// override methods of a class or interface for one-time use.

// This class demonstrates the concept of inner classes in Java.
public class InnerClassDemo {
}
