package com.fanxing;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1",100,new MyDate(2002,11,26)));
        employees.add(new Employee("2",100,new MyDate(2000,11,26)));
        employees.add(new Employee("1",300,new MyDate(2003,11,26)));
        System.out.println(employees);
    }
}
