package com.swiftfingers.strategy1;


/*
 * LowerTextFormatter is a concrete text formatter that implements the TextFormatter interface and the
 * class is used to change the text into lower case.
*/
public class LowerTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
    }
}
