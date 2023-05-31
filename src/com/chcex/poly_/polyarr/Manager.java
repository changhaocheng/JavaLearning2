package com.chcex.poly_.polyarr;

public class Manager extends Empolyee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理正在管理员工");
    }
//    public double getAnnual(){
//        return super.getAnnual() + bonus;
//    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
