package com.swiftfingers.factory2.xml;

public class FeedbackXML implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";
    }
}