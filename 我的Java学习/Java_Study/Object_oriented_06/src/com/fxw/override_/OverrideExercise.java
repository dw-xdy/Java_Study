package com.fxw.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Student student = new Student("Jack", 19, "123456", 100);
        System.out.println(student.say());

        Person person = new Person("Tom", 18);
        System.out.println(person.say());
    }
}

