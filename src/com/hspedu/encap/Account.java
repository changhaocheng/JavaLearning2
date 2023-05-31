package com.hspedu.encap;

public class Account {
    public static void main(String[] args) {

    }

}

class A {
    int age;
    public String name = "";
    private double balance;
    private String password;

    public A(String name, double balance, String password) {
        setBalance(balance);
        setName(name);
        setPassword(password);

    }


    public void setBalance(double balance) {
        if (balance <= 20) {
            System.out.println("该余额不符合要求，赋默认值为0");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void setName(String name) {
        int len = name.length();
        if (len < 2 || len > 4) {
            System.out.println("该名字不符合要求，赋默认值为null");
            this.name = null;
        } else {
            this.name = name;
        }
    }

    public void setPassword(String password) {
        if (password.length() != 6) {
            System.out.println("该密码不符合要求，赋默认值为666666");
            this.password = "666666";
        } else {
            this.password = password;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void info() {
        System.out.println("姓名" + name + "余额" + balance + "密码" + password);
    }

}