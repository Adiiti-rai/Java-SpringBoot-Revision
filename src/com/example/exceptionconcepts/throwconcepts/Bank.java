package com.example.exceptionconcepts.throwconcepts;

public class Bank {
    public void withdraw(int amount){
        if(amount>10000){
            throw new RuntimeException("Withdrawal amount exceeds the limit");
        }
        System.out.println("Withdrawal successful: " + amount);
    }
    public static void main(String[] args){
        Bank bank= new Bank();
        bank.withdraw(20000);
    }
}
