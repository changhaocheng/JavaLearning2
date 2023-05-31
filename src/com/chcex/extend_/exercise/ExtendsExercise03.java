package com.chcex.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        Pc pc = new Pc(10,500,"IBM");
        pc.printInfo();
        NotePade notePade = new NotePade("456",123,123,"blue");
        notePade.printInfo();
        pc.printInfo();

    }
}
class Computer{
    private String cpu = "123";
    double neiCun ;
    double yingPan ;
    //构造器来对属性进行初始化

    public Computer( String cpu,double neiCun, double yingPan) {
        this.cpu = cpu;
        this.neiCun = neiCun;
        this.yingPan = yingPan;
    }
    public Computer( double neiCun, double yingPan) {
        this.neiCun = neiCun;
        this.yingPan = yingPan;
    }
//返回Computer的属性
    public String getDetail(){
        return cpu + " " + neiCun + " " + yingPan ;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getNeiCun() {
        return neiCun;
    }

    public void setNeiCun(double neiCun) {
        this.neiCun = neiCun;
    }

    public double getYingPan() {
        return yingPan;
    }

    public void setYingPan(double yingPan) {
        this.yingPan = yingPan;
    }
}
//返回pc的属性
class Pc extends Computer{
    String brand;

    public Pc(double neiCun, double yingPan, String brand) {
        super( neiCun, yingPan);
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println(getDetail() + "brand" + brand);
    }
}
class NotePade extends Computer{
    String color;

    public NotePade(String cpu, double neiCun, double yingPan, String color) {
        super(cpu,neiCun, yingPan);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void printInfo(){

        System.out.println(getDetail() +" " +  "color" +color);
    }
}

