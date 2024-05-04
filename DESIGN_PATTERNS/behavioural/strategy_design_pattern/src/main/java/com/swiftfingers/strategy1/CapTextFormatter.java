package com.swiftfingers.strategy1;


/*
 * CapTextFormatter is a concrete text formatter that implements the TextFormatter interface and the
 * class is used to change the text into capital case.
*/
public class CapTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("[CapTextFormatter]: "+text.toUpperCase());
    }
}