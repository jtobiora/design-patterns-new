package com.swiftfingers.factory2.services;

import com.swiftfingers.factory2.xml.ResponseXMLParser;
import com.swiftfingers.factory2.xml.XMLParser;

public class ResponseXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }
}