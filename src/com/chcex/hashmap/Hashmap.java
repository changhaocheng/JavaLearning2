package com.chcex.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
//        HashSet set = new HashSet();
//        set.add(new Employee("123",10,new MyDate(2002,11,26)));
//        set.add(new Employee("123",10,new MyDate(2002,11,23)));
//        set.add(new Employee("123",10,new MyDate(2002,11,26)));
//        System.out.println(set);
        HashMap map = new HashMap();
        map.put("1","chc");
        map.put("2","ysw");
        Set set = map.entrySet();
        for (Object obj: set) {
//            Map.Entry entry = (Map.Entry) obj;
//            HashMap.Node entry = (HashMap.Node) obj;
//            System.out.println(entry.getKey() + "\t" + entry.getValue());

        }


    }
}
