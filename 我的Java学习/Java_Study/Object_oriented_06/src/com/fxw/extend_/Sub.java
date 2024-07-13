package com.fxw.extend_;

public class Sub extends Base {

    //子类本身的构造器
    public Sub() {
        System.out.println("sub()....");
    }
    public Sub(String name) {
        System.out.println("sub+++++++++++++++++++++++++++++");
    }
    public Sub(String name, int age) {
        super("xiaoming", 37);
        System.out.println("sub+++++++++++++++++++++++++++++");
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
