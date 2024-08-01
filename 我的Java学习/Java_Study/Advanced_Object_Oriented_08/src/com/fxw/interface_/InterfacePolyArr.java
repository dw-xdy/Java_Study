package com.fxw.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usb = new Usb[2];
        usb[0] = new Phone_();
        usb[1] = new Camera_();

        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if (usb[i] instanceof Phone_) {
                ((Phone_) usb[i]).call();
            }
            System.out.println("=====================");
        }
    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    @Override
    public void work() {
        System.out.println("手机工作中.........");
    }

    public void call() {
        System.out.println("手机可以打电话......");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中.........");
    }
}



