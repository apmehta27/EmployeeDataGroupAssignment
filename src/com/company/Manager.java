package com.company;

public class Manager extends Employee {
    public Manager(String employeeName, String employeeAddress, long employeePhone, long employeeId,double basicSalary) {
        super(employeeName, employeeAddress, employeePhone, employeeId, basicSalary);
    }

    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = (15D/100D) * this.getBasicSalary();
        return transportAllowance;
    }
}
