package com.fxw.homework.homework5;

public class Scientist extends Staff {
    private double bonus;

    public Scientist(double salar, double bonus) {
        super(salar);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double yearSal() {
        return super.yearSal() + getBonus();
    }
}
