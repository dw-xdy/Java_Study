package com.fxw.Object_;

public class ToString_ {
    public static void main(String[] args) {
        /*
        Object的toString() 源码
        (1)getClass().getName() 类的全类名(包名+类名 )
        (2)Integer.toHexString(hashCode()) 将对象的hashCode值转成16进制字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */

        Monster monster = new Monster("小妖怪", "巡山的", 2000);
        System.out.println(monster.toString() + " hashcode = " + monster.hashCode());

        System.out.println(monster.toString());

        System.out.println("==当直接输出一个对象时，toString 方法会被默认的调用==");
        System.out.println(monster); //等价 monster.toString()
    }
}


class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}