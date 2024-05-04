package com.swiftfingers.composite3;

//A leaf class
//It does not have other child objects
public class Developer implements Employee {

    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name);
    }
}