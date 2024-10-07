package com.sp.oop;

public abstract class Employee extends Person implements Salary {
    private String id;
    public Employee(){
        super();
        id="";
    }
    public Employee(String name, String id){
        super(name);
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}