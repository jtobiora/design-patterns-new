package com.swiftfingers.strategy3;

import java.util.Arrays;

public class StrategyExample {

    public static void main(String[] args) {
        double[] amounts = {100, 200, 300}; // Amounts to calculate tax for
        AccountingApplication accountingApplication = new AccountingApplication(new IncomeTaxCalculator());
        System.out.println("Total Income Tax: " + accountingApplication.calculateTax(amounts));

        accountingApplication.setTaxCalculator(new VATCalculator());
        System.out.println("Total VAT Tax: " + accountingApplication.calculateTax(amounts));

        accountingApplication.setTaxCalculator(new SalesTaxCalculator());
        System.out.println("Total Sales Tax: " + accountingApplication.calculateTax(amounts));
    }
}
