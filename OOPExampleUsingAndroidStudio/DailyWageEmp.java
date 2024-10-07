package com.sp.oop;

public class DailyWageEmp extends Employee {
    private double hourlyrate;
    private double hourwork;
    DailyWageEmp(){
        super();
        this.hourlyrate = 0.0;
        this.hourwork = 0.0;
    }
    DailyWageEmp(String name, String id, double hourlyrate, double hourwork){
        super(name, id);
        this.hourlyrate =  hourlyrate;
        this.hourwork = hourwork;
    }
    public double getHourlyrate(){
        return hourlyrate;
    }
    public double getHourwork(){
        return hourwork;
    }
    public void setHourlyrate(double hourlyrate){
        this.hourlyrate = hourlyrate;
    }
    public void setHourwork(double hourwork){
        this.hourwork = hourwork;
    }
    public double calculateSalary(){
        double salary;//local variale
        if(hourwork > 40) {
            salary = hourlyrate * (40 + 1.5 * (hourwork - 40));
        }else{
            salary = hourlyrate * hourwork;
        }
        //System.out.println("in Daily wage emp:"+salary);
        return salary;
    }
}
