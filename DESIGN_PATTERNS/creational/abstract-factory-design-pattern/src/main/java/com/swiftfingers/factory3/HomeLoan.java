package com.swiftfingers.factory3;

public class HomeLoan implements Account {

    @Override
    public void getInterestRate() {
        System.out.println("Home Loan Interest Rate = 8.5% pa");
    }

}