package com.swiftfingers.factory2.services;

import com.swiftfingers.factory2.xml.ErrorXMLParser;
import com.swiftfingers.factory2.xml.XMLParser;

public class ErrorXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new ErrorXMLParser();
    }
}