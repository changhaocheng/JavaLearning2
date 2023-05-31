package com.chcex.hashmap;

import java.util.Objects;

public class Employee {
    private String name;
    private int sal;
    private MyDate bir;

    public Employee(String name, int sal, MyDate bir) {
        this.name = name;
        this.sal = sal;
        this.bir = bir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return sal == employee.sal && name.equals(employee.name) && bir.equals(employee.bir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, bir);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", bir=" + bir.getYear() + bir.getMonth() + bir.getDay() +
                '}';
    }
}
