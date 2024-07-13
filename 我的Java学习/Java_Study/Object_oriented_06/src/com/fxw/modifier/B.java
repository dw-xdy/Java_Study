package com.fxw.modifier;

public class B {
    public void say() {
        A a = new A();
        //在同一个包中可以访问的属性：public, protected 和 默认! private不可以进行访问
        System.out.println("n1 = " + a.n1 + " n2 = " + a.n2 + " n3 = " + a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
