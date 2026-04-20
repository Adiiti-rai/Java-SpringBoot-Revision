package com.example.inheritanceconcepts;

//single inheritance is a type of inheritance where a class inherits properties and
// behaviors from a single parent class.
// In this example, we have a parent class called Payment
// and a child class called UpiPayment that inherits from Payment.
public class Payment{
    void makePayment(){
        System.out.println("Payment made successfully.");
    }
}
class UpiPayment extends Payment{

    @Override
    void makePayment(){
        System.out.println("UPI Payment made successfully.");
    }
}

 class SingleInheritance {
    public static void main(String[] args){
        UpiPayment upiPayment= new UpiPayment();
        upiPayment.makePayment();

    }
}

