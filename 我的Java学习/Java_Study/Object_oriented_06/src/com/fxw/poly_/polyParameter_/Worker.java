package com.fxw.poly_.polyParameter_;

public class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }

    public void work() {
        System.out.println("员工" + getName() + "正在进行工作");
    }

    public double getAnnual() {
        return super.getAnnual();
    }
}
