package com.inner.noname;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();

    }
}
class Outer{
    private int n1 = 10;
    public void method(){
        int n2 = 30;
        //内部类使用方法内的变量需要有final修饰
        new A(){
            private int n1 = 40;
            public void cry(){
                System.out.println(++n1);
            }
        }.cry();
    }
}
interface A{

}
