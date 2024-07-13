package com.fxw.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Jack";
        pupil.age = 9;
        System.out.println("Jack is examing");
        pupil.setScore(100);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "Tom";
        graduate.age = 19;
        System.out.println("Tom is examing");
        graduate.setScore(100);
        graduate.showInfo();
    }
}
