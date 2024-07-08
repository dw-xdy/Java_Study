public class methodexercise_09 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "milan";
        p.age = 10;
        myTool tool = new myTool();

        Person1 p2 = tool.copyPerson1(p);

        System.out.println("p的属性：age = " + p.age + " 名字是：" + p.name);
        System.out.println("p2的属性：age = " + p2.age + " 名字是：" + p2.name);
    }
}

class Person1 {
    String name;
    int age;
}

class myTool {
    public Person1 copyPerson1(Person1 p) {
        Person1 P = new Person1();
        P.age = p.age;
        P.name = p.name;
        return P;
    }
}