package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework02 {

}

class Frock {
    private static int currrentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        return currrentNum += 100;
    }


}


class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();

        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());

    }
}