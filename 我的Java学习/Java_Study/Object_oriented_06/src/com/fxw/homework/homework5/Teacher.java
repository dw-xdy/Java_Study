package com.fxw.homework.homework5;

public class Teacher extends Staff {
    private double remuneration;

    public Teacher(double salar, double remuneration) {
        super(salar);
        this.remuneration = remuneration;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public double yearSal() {
        return super.yearSal() + getRemuneration();
    }
}
