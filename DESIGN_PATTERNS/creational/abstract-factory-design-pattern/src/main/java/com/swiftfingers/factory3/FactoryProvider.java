package com.swiftfingers.factory3;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        AbstractFactory af = null;
        if ("Loan".equalsIgnoreCase(choice)) {
            af = new LoanFactory();
        } else if ("Account".equalsIgnoreCase(choice)) {
            af = new AccountFactory();
        }
        return af;
    }
}