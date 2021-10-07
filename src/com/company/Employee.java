package com.company;

public class Employee {
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private final double SPECIAL_ALLOWANCE = 250.80;
    private final double HRA = 1000.50;

    public Employee(String employeeName, String employeeAddress, long employeePhone
            , long employeeId, double basicSalary) {

        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    public double calculateSalary(){
        double salary = basicSalary + (basicSalary * SPECIAL_ALLOWANCE/100) + (basicSalary * HRA/100);
        return salary;
    }

    public double calculateTransportAllowance(){
        double transportAllowance = (10D/100D) * basicSalary;
        return transportAllowance;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeePhone=" + employeePhone +
                ", basicSalary=" + basicSalary +
                ", SPECIAL_ALLOWANCE=" + SPECIAL_ALLOWANCE +
                ", HRA=" + HRA;
    }
}
