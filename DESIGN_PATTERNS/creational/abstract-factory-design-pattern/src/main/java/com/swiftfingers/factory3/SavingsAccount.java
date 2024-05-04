package com.swiftfingers.factory3;

public class SavingsAccount implements Account {

    @Override
    public void getInterestRate() {
        System.out.println("Savings Account Interest Rate = 4.0% pa");
    }

}