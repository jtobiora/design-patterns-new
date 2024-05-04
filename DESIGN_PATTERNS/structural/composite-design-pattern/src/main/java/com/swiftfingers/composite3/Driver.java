package com.swiftfingers.composite3;

public class Driver {
    public static void main (String[] args) {
        Developer dev1 = new Developer(100, "Patrick Ken", "Pro Developer");
        Developer dev2 = new Developer(101, "Sam Nwoye", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Vitalis Okoye", "SEO Manager");
        Manager man2 = new Manager(201, "Andrew Mark ", "Sash Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
