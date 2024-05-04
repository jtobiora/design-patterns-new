package com.swiftfingers.strategy3;

import java.util.Arrays;

public class AccountingApplication {

    private TaxCalculator taxCalculator;

    public AccountingApplication(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public double calculateTax(double[] amounts) {
        // Tax Calculation Logic.
        // For each amount, calculate tax and add to total tax
        return Arrays.stream(amounts)
                .map(taxCalculator::calculateTax)
                .sum();
    }

    public void setTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
}