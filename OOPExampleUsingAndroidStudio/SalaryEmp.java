package com.sp.oop;

public class SalaryEmp extends Employee{
    private double salary;
    SalaryEmp(){
        super();
        this.salary = 0.0;
    }
    SalaryEmp(String name, String id, double salary){
        super(name,id);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double calculateSalary(){
        return salary;
    }
}
