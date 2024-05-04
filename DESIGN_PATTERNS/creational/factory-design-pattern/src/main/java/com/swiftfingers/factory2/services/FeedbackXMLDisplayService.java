package com.swiftfingers.factory2.services;

import com.swiftfingers.factory2.xml.FeedbackXML;
import com.swiftfingers.factory2.xml.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService{
    @Override
    public XMLParser getParser() {
        return new FeedbackXML();
    }
}