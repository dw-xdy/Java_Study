package com.fxw.single_;

public class SingleTon02 {
    public static void main(String[] args) {

    }
}

class Cat {
    private String name;

    private static Cat cat;
    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("Jenny");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}


