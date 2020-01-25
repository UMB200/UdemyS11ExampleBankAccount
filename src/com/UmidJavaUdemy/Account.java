package com.UmidJavaUdemy;

import java.util.ArrayList;

public class Account {
    private double balance =0;
    private String accName;
    private ArrayList<Double> transactionsArray;

    public Account(String accName) {
        this.accName = accName;
        this.transactionsArray = new ArrayList<>();
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }
    public void depositAmount(double amount){
        if(amount >0){
            this.balance +=amount;
            this.transactionsArray.add(amount);
            System.out.println(accName + " account " + " deposited " + amount + " balance is " + this.balance);
        }
        else {
            System.out.println("Can't deposit negative amount");
        }
    }
    public void withdrawAmount (double amount){
        if(this.balance >= amount && amount >0){//in example shown no balance check is provided
            this.balance -=amount;
            this.transactionsArray.remove(amount); //in example shown it is this.transactionsArray.add(amount);
            System.out.println("Withdraw from " + accName + " account "+ amount + " balance is " + this.balance);
        }
        else {
            System.out.println("Amount is negative or exceeds available balance");
        }
    }
    public void calcBalance(){
        this.balance = 0; // why it is 0???
        for(double i : this.transactionsArray){
            this.balance +=i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
