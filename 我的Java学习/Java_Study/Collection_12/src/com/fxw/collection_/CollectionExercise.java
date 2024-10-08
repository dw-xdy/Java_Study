package com.fxw.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Dog("Tom", 4));
        list.add(new Dog("Jack", 5));
        list.add(new Dog("KK", 3));


        System.out.println("========增强for循环======");
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("=====迭代器==============");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}