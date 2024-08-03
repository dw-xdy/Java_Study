package com.fxw.interclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10.Inner10 inner10 = new Outer10.Inner10();

        Outer10 outer10 = new Outer10();
        Outer10.Inner10 inner = outer10.getInner();

        Outer10.Inner10 inner1 = Outer10.getInner_();
    }
}


class Outer10 {
    private int age = 19;
    private static String name = "Jack";

    static class Inner10 {
        public void say() {
            System.out.println("say()...........");
        }
    }

    public Inner10 getInner() {
        return new Inner10();
    }
    public static Inner10 getInner_() {
        return new Inner10();
    }
}