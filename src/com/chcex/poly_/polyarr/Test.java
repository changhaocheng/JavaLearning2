package com.chcex.poly_.polyarr;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入职位1.经理2.普通员工");
        Test test = new Test();
        if (scanner.nextInt() == 1){
            System.out.println("请输入姓名");
            System.out.println("请输入月工资");
            System.out.println("请输入奖金");
            Manager manager = new Manager(scanner.next(), scanner.nextDouble(), scanner.nextDouble());
            test.showEmpAnnual(manager);
            test.testWork(manager);
        }else  {
            System.out.println("请输入姓名");
            System.out.println("请输入月工资");
            Normal normal = new Normal(scanner.next(), scanner.nextDouble());
            test.showEmpAnnual(normal);
            test.testWork(normal);
        }


    }
    public void showEmpAnnual(Empolyee e){

        System.out.println(e.getName() + "年薪为" +  e.getAnnual());
    }
    public void testWork(Empolyee e){
        if (e instanceof Manager) {
            ((Manager) e).manage();
        }else if (e instanceof  Normal) {
            ((Normal) e).work();
        }else {
            System.out.println("职位输入有误");
        }
    }
}
