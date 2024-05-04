package com.swiftfingers.proxy.virtual_impl;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String employeeName;
    private double employeeSalary;
    private String employeeDesignation;

    public Employee(String employeeName,double employeeSalary,String
            employeeDesignation){
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public String toString(){
        return "Employee Name: "+employeeName+", EmployeeDesignation: "+
                employeeDesignation+", Employee Salary: "+employeeSalary;
    }
}
