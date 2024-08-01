package com.fxw.interface_;

import com.sun.media.jfxmediaimpl.HostUtils;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LitterMonkey litterMonkey = new LitterMonkey("wukong");
        litterMonkey.climbing();
        litterMonkey.swimming();
        litterMonkey.flying();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " 会爬树");
    }
}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

class LitterMonkey extends Monkey implements Fishable, Birdable{
    public LitterMonkey(String name) {
        super(name);
    }

    public void swimming() {
        System.out.println(getName() + " 通过后天的努力学习了游泳");
    }

    public void flying() {
        System.out.println(getName() + " 通过后天的努力学习了飞翔");
    }
}

