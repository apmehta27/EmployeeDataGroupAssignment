package com.company;

/*
 1 .creat an com.company.Employee class
 instance variables
 employeeId - long
 employeeName - String
 employeeAddress - String
 employeePhone - Long
 basicSalary - double
 specialAllowance - double default value 250.80
 Hra - double value 1000.50

2. create overloaded constructor in com.company.Employee class
 3.create constructor with parameters
 Id
 Name
 address
 phone



*/

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getCurrencyInstance();

        Employee employee = new Manager("Peter","Chennai India",237844,0001,1000);

        Employee employee2 = new Trainee("Jack", "Mumbai India", 442085, 29846, 1000);

        System.out.println(format.format(employee.calculateSalary()));
        System.out.println(format.format(employee.calculateTransportAllowance()));
        System.out.println(employee);

        System.out.println(format.format(employee2.calculateSalary()));
        System.out.println(format.format(employee2.calculateTransportAllowance()));
        System.out.println(employee2);

        NumberFormat.getCurrencyInstance().format(8545000);


    }
}
