package com.swiftfingers.proxy.virtual_impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
* The Company class has a reference to ContactList interface whose real object will be loaded only when requested to
call its getContactList() method.
* */
@Data
@NoArgsConstructor
public class Company {
    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;

    public Company(String companyName,String companyAddress, String companyContactNo,
                   ContactList contactList){
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
        System.out.println("Company object created...");
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyContactNo='" + companyContactNo + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
