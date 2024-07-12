public class homework_29 {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    String gender;
    int age;
    String position;
    double sal;

    public Employee(String name, String gender, int age, String position, double sal) {
        this(name, gender, age);
        this.position = position;
        this.sal = sal;
    }
    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public Employee(String position, double sal) {
        this.position = position;
        this.sal = sal;
    }

}
