package com.swiftfingers.proxy.virtual_impl;

import java.util.List;


/*
* The ContactListProxyImpl is the proxy class which also implements ContactList and holds a reference to the real
ContactList object. On the implementation of the method getEmployeeList() it will check if the contactList
reference is null, then it will create a real ContactList object and then will invoke the getEmployeeList() method on
it to get the list of the employees.
* */
public class ContactListProxyImpl implements ContactList{
    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if(contactList == null){
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListRealImpl();
        }
        return contactList.getEmployeeList();
    }
}