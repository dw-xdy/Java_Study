public class OverLoad_13 {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        System.out.println(mc.calculate(2.3, 5));

//        Medthods dai = new Medthods();
//        System.out.println(dai.m(4));
//        System.out.println(dai.m(2, 3));
//        dai.m("fetishization");
        Medthods wo = new Medthods();

        System.out.println(wo.max(3, 6));
        System.out.println(wo.max(1.5, 6.7));
        System.out.println(wo.max(3.5, 1.1, 4.5));



    }
}

class MyCalculator {
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }
    public double calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

class Medthods {
    public int m(int n) {
        return n * n;
    }
    public int m(int n1, int n2) {
        return n1 * n2;
    }
    public void m(String n) {
        System.out.println(n);
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }
    public double max(double n1, double n2, double n3) {
        return n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
    }
}