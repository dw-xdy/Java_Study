package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(3);
        Taxi.Air air = taxi.new Air();
        air.flow();

        Taxi.Air air33 = new Taxi(40).new Air();

        Taxi taxi1 = new Taxi(34);
        taxi1.getAir().flow();
    }
}

class Taxi {
    private double temperature;

    public Taxi(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹cold风...............");
            } else if (temperature < 0) {
                System.out.println("吹hot风...............");
            } else {
                System.out.println("No Wind and close it................");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}


