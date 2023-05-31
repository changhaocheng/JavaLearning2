package com.fanxing;

public class Employee {
    private String name;
    private int sal;
    private MyDate bir;

    public Employee(String name, int sal, MyDate bir) {
        this.name = name;
        this.sal = sal;
        this.bir = bir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBir() {
        return bir;
    }

    public void setBir(MyDate bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", bir=" + bir +
                '}';
    }
}
