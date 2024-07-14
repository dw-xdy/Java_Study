package com.fxw.extend_;

public class Sub extends Base {

    //子类本身的构造器
    public Sub() {
        super("kaishi", 28);
        System.out.println("子类的Sub()构造器被调用");
    }
    public Sub(String name) {
        super("Tom", 19);
        System.out.println("子类的Sub(String name)构造器被调用");
    }

    public Sub(String name, int age) {
        super("king");
        System.out.println("子类的Sub(String name, int age)构造器被调用");
    }



    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        test100();
        test200();
        test300();
        System.out.println("n4 = " + getN4());
        callTest400();
    }
}
