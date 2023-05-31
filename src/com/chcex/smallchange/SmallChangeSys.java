package com.chcex.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        String key = "";
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        Date date = null;
        double money = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh: mm");
        do{
            System.out.println("==================零钱通菜单================");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退       出");
            System.out.println("请输入(1-4)");
            key = scanner.next();
            switch (key){
                case "1" :
                    System.out.println("================零钱通明细=============");
                    System.out.println(s1);
                    break;
                case "2":
                    System.out.println("收益金额：");
                    double money1 = scanner.nextDouble();
                    if (money1 <= 0 ) {
                        System.out.println("收益金额必须大于零元");
                        break;
                    }
                    date = new Date();
                    money += money1;
                    s1 += "\n收益入账" + "\t+" + money1 + "\t" + sdf.format(date) + "\t余额：" +  money;
                    break;
                case "3" :
                    System.out.println("消费说明：");
                    String act = scanner.next();
                    double money2 = scanner.nextDouble();
                    if (money2 > money) {
                        System.out.println("余额不足");
                        break;
                    }
                    date = new Date();
                    money -= money2;
                    s1 += "\n" + act + "\t-" + money2 + "\t" + sdf.format(date) + "\t余额：" +  money;
                    break;
                case "4" :
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while (loop);
        System.out.println("零钱通已退出");
    }
}
