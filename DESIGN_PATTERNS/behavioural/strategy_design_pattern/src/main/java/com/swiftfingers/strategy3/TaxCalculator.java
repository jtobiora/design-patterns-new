package com.swiftfingers.strategy3;

public interface TaxCalculator {
    double calculateTax(double amount);

    TaxType getTaxType();
}
