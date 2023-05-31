package com.chcex.poly_.polyarr;

public class Normal extends Empolyee{
    public Normal(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("员工正在工作");
    }
//    public double getAnnual(){
//        return super.getAnnual();
//    }


    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
