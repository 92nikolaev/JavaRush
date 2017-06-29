package com.javarush.task.task14.task1417;

public abstract class Money {
    public Money(double amount) {
        this.amount = amount;
    }
    private double amount;


    public abstract String getCurrencyName();

    public double getAmount(){
        return amount;
    }

}

