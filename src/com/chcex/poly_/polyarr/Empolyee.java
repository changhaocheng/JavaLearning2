package com.chcex.poly_.polyarr;

public class Empolyee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Empolyee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getAnnual(){
        return salary * 12;
    }
}
