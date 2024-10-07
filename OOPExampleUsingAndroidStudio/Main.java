package com.sp.oop;

public class Main {
        public static void main(String[] args){
        SalaryEmp simon = new SalaryEmp();//invoke default constructor
        simon.setName("Simon");//invoke inherited method
        simon.setId("12345");//invoke inherited method
        simon.setSalary(3000);//invoke own method
        //invoke parameterized constructor to initialize object
        DailyWageEmp john = new DailyWageEmp("John","12155",5,45);
        //polymorphism
        Person per = simon;
        System.out.println("Person name:"+ per.getName());///per behaves like child simon
        System.out.println(simon.getName()+" earn $"+simon.calculateSalary());
        per = john;
        System.out.println("Person name:"+ per.getName());//per behaves like child john
        System.out.println(john.getName()+" earn $"+john.calculateSalary());
    }
}