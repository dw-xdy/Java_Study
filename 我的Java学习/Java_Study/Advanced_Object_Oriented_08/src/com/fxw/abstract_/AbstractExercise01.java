package com.fxw.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("Jack", "54321", 90000, 10000);
        CommonEmployee tom = new CommonEmployee("Tom", "4523", 432);

        jack.work();
        tom.work();

        int a = 78;
    }
}



