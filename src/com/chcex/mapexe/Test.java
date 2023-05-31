package com.chcex.mapexe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        for (int i = 0; i <= 15; i++) {
            hashMap.put(i,"chc");
        }
        hashMap.put(16,"ysw");
        System.out.println(hashMap);
//        hashMap.put(1,new Employee("chc",19000,"1"));
//        hashMap.put(2,new Employee("cho",9000,"2"));
//        hashMap.put(3,new Employee("srp",190000,"3"));
//        Set set = hashMap.keySet();
//        for (Object key: set) {
//            Object o = hashMap.get(key);
//            Employee e = (Employee) o;
//            if(e.getSal() > 18000){
//                System.out.println(e);
//            }
//        }
//        System.out.println("=====================");
//        Set set1 = hashMap.entrySet();
//        Iterator iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry next = (Map.Entry) iterator.next();
//            Employee e = (Employee) next.getValue();
//            if(e.getSal() > 18000){
//                System.out.println(e);
//            }
//        }
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//
//        }
    }
}
