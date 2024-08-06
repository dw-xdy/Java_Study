package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", null);

        person.common();
        person.passRiver();
        person.passVolcanoland();



    }
}


interface Vehicles {
    void work();
}


class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("行走在一般路面上, 使用horse作用交通工具, 工作中..........");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("渡过在大河时, 使用boat作用交通工具, 工作中..........");
    }
}

class Plane implements Vehicles {

    @Override
    public void work() {
        System.out.println("过火焰山的时候, 需要坐飞机才能过去.................");
    }
}


class VehicleFactory {

    private static Horse horse = new Horse();
    private VehicleFactory() {}
    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}










class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        //先得到船, 从工厂类中进行创建.然后让船工作.
        //但是在这里“二话不说”就创建一个对象, 传进来的那个无论有用没有都已经浪费了.
        if (vehicles instanceof Boat) {
            vehicles.work();
        } else {
            Boat boat = VehicleFactory.getBoat();
            boat.work();
        }
    }

    public void common() {
        if (vehicles instanceof Horse) {
            vehicles.work();
        } else {
            Horse horse = VehicleFactory.getHorse();
            horse.work();
        }
    }

    public void passVolcanoland() {
        if (vehicles instanceof Plane) {
            vehicles.work();
        } else {
            Plane plane = VehicleFactory.getPlane();
            plane.work();
        }
    }
}



