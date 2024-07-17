package com.fxw.homework;

public class homework04 {
    public static void main(String[] args) {
        Worker jack = new Worker("Jack", 100, 30, 1.0);
        System.out.println(jack.printWage());
        Manager tom = new Manager("Tom", 200, 30, 1.2);
        tom.setBonus(3000);
        System.out.println(tom.printWage());

    }


}

class Staff {
    private String name;
    private double singleWage;
    private int workdays;
    private double grade;

    public Staff(String name, double singleWage, int workdays, double grade) {
        this.name = name;
        this.singleWage = singleWage;
        this.workdays = workdays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleWage() {
        return singleWage;
    }

    public void setSingleWage(double singleWage) {
        this.singleWage = singleWage;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double printWage() {
        return singleWage * workdays * grade;
    }
}


class Manager extends Staff {
    private double bonus;
    public Manager(String name, double singleWage, int workdays, double grade) {
        super(name, singleWage, workdays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double printWage() {
        return super.printWage() + getBonus();
    }
}


class Worker extends Staff {
    public Worker(String name, double singleWage, int workdays, double grade) {
        super(name, singleWage, workdays, grade);
    }

    public double printWage() {
        return super.printWage();
    }
}