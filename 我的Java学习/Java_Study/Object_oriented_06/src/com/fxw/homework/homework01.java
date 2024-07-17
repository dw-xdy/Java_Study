package com.fxw.homework;

public class homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];

        person[0] = new Person("Jack", 19, "car");
        person[1] = new Person("Tom", 13, "car");
        person[2] = new Person("Smith", 59, "car");

        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                //并按照 age 从 大到 小进行排序, 如果前面的人的age < 后面人的年龄，就交换
                //要求按照名字的长度从小到大 if(persons[i].getName().length() > persons[i+1].getName().length())
                if (person[j].getAge() > person[j + 1].getAge()) {
                    Person temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i] + " ");
        }

    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}