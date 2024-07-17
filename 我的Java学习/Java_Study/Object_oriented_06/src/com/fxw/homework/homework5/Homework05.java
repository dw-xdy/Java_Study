package com.fxw.homework.homework5;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Worker worker = new Worker(100);
        System.out.println(worker.yearSal());
        Peasant peasant = new Peasant(100);
        System.out.println(peasant.yearSal());
        Waiter waiter = new Waiter(100);
        System.out.println(waiter.yearSal());
        Scientist scientist = new Scientist(100, 10000);
        System.out.println(scientist.yearSal());
        Teacher teacher = new Teacher(100, 5000);
        System.out.println(teacher.yearSal());

    }
}
