package com.fxw.abstract_;

class CommonEmployee extends Employee {
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "正在进行工作");
    }
}

