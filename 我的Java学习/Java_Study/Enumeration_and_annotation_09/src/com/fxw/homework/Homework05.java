package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();

    }
}

class A {
    private String name = "Jack";

    public void hi() {
        class B {
            private String name = "Tom";

            public void show() {
                System.out.println("B类中的名字是：" + this.name + "， A类中的名字是：" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
