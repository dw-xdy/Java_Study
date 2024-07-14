package com.fxw.extend_.exercise;

public class PC extends Computer {

    private String brand;
    //这里IDEA 根据继承的规则，自动把构造器的调用写好
    //这里也体现： 继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {// PC的构造器, 需要写入四个变量,
        super(cpu, memory, disk);  // 这里是调用了Computer的构造器, 其中的cpu都是变量!!!!!!
        setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC的信息如下：");
        System.out.println(getDetails() + " brand = " + getBrand());
    }
}
