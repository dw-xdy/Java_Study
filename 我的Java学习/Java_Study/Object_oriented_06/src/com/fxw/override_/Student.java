package com.fxw.override_;

class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    // 第一种做法(不建议使用)
//    public String say() {
//        return "My name is " + getName() + " I'am " + getAge() + " years old" +
//        " My id is " + id + " And I got " + score + " points";
//    }

    //第二种做法(体现了super的好处)
    public String say() {
        return super.say() + " My id is " + id + " And I got " + score + " points";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}