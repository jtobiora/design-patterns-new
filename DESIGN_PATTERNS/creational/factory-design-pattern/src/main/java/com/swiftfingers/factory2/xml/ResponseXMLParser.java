package com.swiftfingers.factory2.xml;

public class ResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
