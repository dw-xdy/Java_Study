package com.fxw.homework.homework5;

public class Staff {
    private double salar;

    public Staff(double salar) {
        this.salar = salar;
    }

    public double getSalar() {
        return salar;
    }

    public void setSalar(double salar) {
        this.salar = salar;
    }

    public double yearSal() {
        return salar * 12;
    }
}
