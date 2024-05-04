package com.swiftfingers.factory2.services;

import com.swiftfingers.factory2.xml.OrderXMLParser;
import com.swiftfingers.factory2.xml.XMLParser;

public class OrderXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }
}