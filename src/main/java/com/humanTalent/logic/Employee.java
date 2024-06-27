
package com.humanTalent.logic;


public class Employee {
    private String name;
    private String lastName;
    private String dni;
    private String phoneNumber;
    private WorkArea workArea;
    private boolean status;
    private double salary;

    public Employee(String name,String lastName,String dni,String phoneNumber ,WorkArea workArea, boolean status,double salary   ) {
        this.salary = salary;
        this.status = status;
        this.workArea = workArea;
        this.phoneNumber = phoneNumber;
        this.dni = dni;
        this.lastName = lastName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WorkArea getWorkArea() {
        return workArea;
    }

    public void setWorkArea(WorkArea workArea) {
        this.workArea = workArea;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

