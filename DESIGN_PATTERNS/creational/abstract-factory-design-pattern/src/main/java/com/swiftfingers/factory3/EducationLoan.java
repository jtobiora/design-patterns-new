package com.swiftfingers.factory3;

public class EducationLoan implements Account {

    @Override
    public void getInterestRate() {
        System.out.println("Education Loan Interest Rate = 11.5% pa");
    }

}