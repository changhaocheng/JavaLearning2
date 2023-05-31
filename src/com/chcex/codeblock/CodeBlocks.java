package com.chcex.codeblock;

import com.chclearn.poly.A;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CodeBlocks {
    public static void main(String[] args) {
//        System.out.println(BB.n1);

        new BB();
        System.out.println("==================");
        new BB();
    }
}
class  AA{

    {
        System.out.println("AA普通代码块被调用");
    }
     static {
        System.out.println("AA静态代码块被调用");
    }
}
class  BB extends AA {
    public static int n1 = 9;
    {
        System.out.println("BB普通代码块被调用");
    }
    static {
        System.out.println("BB静态代码块被调用");
    }
}