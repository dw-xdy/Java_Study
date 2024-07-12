public class homework_23 {
    public static void main(String[] args) {
        Circle1 C = new Circle1(5);

        System.out.println(C.area());
        System.out.println(C.circumference());

       
    }
}


class Circle1 {
    int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }
    public double circumference() {
        return radius * 1.0 * 2 * Math.PI;
    }
    public double area() {
        return radius * 1.0 * radius * Math.PI;
    }
}