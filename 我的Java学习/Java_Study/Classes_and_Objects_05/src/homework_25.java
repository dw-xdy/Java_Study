public class homework_25 {
    public static void main(String[] args) {
        Dog d = new Dog("Tom", "yellow", 4);
        d.show();
    }
}


class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("name = " + this.name);
        System.out.println("color = " + this.color);
        System.out.println("age = " + this.age);
    }
}