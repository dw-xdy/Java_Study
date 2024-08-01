package com.fxw.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Camera camera = new Camera();
        Phone phone = new Phone();

        computer.work(phone);
        System.out.println("===========================");
        computer.work(camera);
    }
}
