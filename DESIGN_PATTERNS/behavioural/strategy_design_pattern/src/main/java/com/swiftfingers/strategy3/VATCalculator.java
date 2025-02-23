package com.swiftfingers.strategy3;

public class VATCalculator implements TaxCalculator {

    public static final double FIX_RATE_PERCENTAGE = 0.15;

    @Override
    public double calculateTax(double amount) {
        // VAT Calculation Logic.
        // Fixed rate of 15% for VAT
        return FIX_RATE_PERCENTAGE * amount;
    }

    @Override
    public TaxType getTaxType() {
        return TaxType.VAT_TAX;
    }
}
