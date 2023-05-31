package com.inner.innerexe01;

public class Test {
    public static int n1  =10;
    public int n2  =20;
    public Test(){
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }
     static
     class Inner{
        public int a = 5;
        public void so(){
            System.out.println(Test.n1);
        }
    }

    public static void main(String[] args) {
//        当Inner是静态内部类时,以下三种等价
//        Inner inner = new Test.Inner();
//        Inner inner = new Inner();
        Test.Inner inner = new Test.Inner();
//        当Inner是非静态内部类时
//        Test test = new Test();
//        Inner inner = test.new Inner();
        System.out.println(inner.a);
        System.out.println(Test.);
    }
}
