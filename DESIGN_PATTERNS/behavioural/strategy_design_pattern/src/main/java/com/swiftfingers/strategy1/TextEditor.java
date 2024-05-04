package com.swiftfingers.strategy1;


//Context class
//Holds a reference to the Strategy object
public class TextEditor {
    private final TextFormatter textFormatter;
    public TextEditor(TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }
    public void publishText(String text){
        textFormatter.format(text);
    }
}