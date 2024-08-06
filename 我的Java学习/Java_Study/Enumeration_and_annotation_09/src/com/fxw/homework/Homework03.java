package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}

//interface Animal {
//    void shout();
//}

//class Cat implements Animal {
//    @Override
//    public void shout() {
//        System.out.println("miao~ miao~");
//    }
//}
//
//
//class Dog implements Animal {
//    @Override
//    public void shout() {
//        System.out.println("wang~ wang~");
//    }
//}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("miao~ miao~");
    }
}


class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("wang~ wang~");
    }
}