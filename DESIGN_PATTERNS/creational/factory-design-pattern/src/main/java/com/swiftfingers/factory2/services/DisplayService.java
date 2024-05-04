package com.swiftfingers.factory2.services;

import com.swiftfingers.factory2.xml.XMLParser;

/*
 * This class is used to display the message fetched by the XML parser to the user. The above class is an
 * abstract class that contains two important methods. The display method is used to display the message to the user.
 * */
public abstract class DisplayService {
    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    //The getParser method is the factory method which is implemented by the subclasses to instantiate
    // the parser object and the method is used by the
    //display method in order to parse the XML and gets the message to display.
    protected abstract XMLParser getParser();
}
