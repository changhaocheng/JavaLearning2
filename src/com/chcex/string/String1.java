package com.chcex.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class String1 {
    public static void main(String[] args) {
        Dog dog = new Dog("1",1);
        Dog dog1 = new Dog("2",2);
        Dog dog2 = new Dog("3",3);
        List l = new ArrayList();
        l.add(dog);
        l.add(dog1);
        l.add(dog2);
        System.out.println(l);
        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator = l.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for (Object o : l
             ) {
            System.out.println(o);
        }


    }
}
