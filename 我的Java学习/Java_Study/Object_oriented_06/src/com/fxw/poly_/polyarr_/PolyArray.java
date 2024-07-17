package com.fxw.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下：要求创建1个Person对象、
        // 2个Student 对象和2个Teacher对象, 统一放在数组中，并调用每个对象say方法

        Person[] persons = new Person[5];

        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < persons.length; i++) {
            //老师提示: person[i] 编译类型是 Person ,运行类型是是根据实际情况有JVM来判断
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                System.out.println(((Student) persons[i]).study());
            } else if (persons[i] instanceof Teacher) {
                System.out.println(((Teacher) persons[i]).teach());
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("你输入的类型错误, 请重新输入");
            }
        }
    }
}
