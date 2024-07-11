public class Constructor_16 {
    public static void main(String[] args) {
//        dog d1 = new dog("Jack", 4);
//        System.out.println("d1的对象信息如下：" + d1.name);
//        System.out.println("d1的对象信息如下：" + d1.age);
//        dog d2 = new dog("tom");
//        System.out.println("d2的对象信息" + d2.name);
        mySelf m1 = new mySelf();
        System.out.println(m1.age);
        mySelf m2 = new mySelf("fengxiaowei", 19);
        System.out.println(m2.age);
        System.out.println(m2.name);

    }
}

class dog {
    String name;
    int age;
    public dog(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
    public dog(String pName) {
        name = pName;
    }

}
class mySelf {
    int age;
    String name;
    public mySelf() {
        age = 18;
    }
    public mySelf(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}