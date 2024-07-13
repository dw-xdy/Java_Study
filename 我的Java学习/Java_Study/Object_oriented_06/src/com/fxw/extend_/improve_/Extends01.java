package com.fxw.extend_.improve_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Jack";
        pupil.age = 19;
        pupil.setScore(90);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "Tom";
        graduate.age = 19;
        graduate.setScore(99);
        graduate.showInfo();
    }
}
