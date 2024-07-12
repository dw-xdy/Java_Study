public class ThisDetail_18 {
    public static void main(String[] args) {
        sheep s = new sheep();
        Duck dd1 = new Duck("jack", 10);
        Duck dd2 = new Duck("jack", 10);
//        s.f();
        System.out.println(dd1.compareTo(dd2));
    }
}


class sheep {
    String name = "Jack";
    int age = 19;

    public sheep() {
        this("kaishi", 19);
        System.out.println("shuchuseheep");
    }
    public sheep(String name, int age) {
        System.out.println("kaishdigajklasdfjklsdhfjaklhasjkldfhalkjhdasfhjkl");
    }

    public void f() {
        //若是加上了this就表示明确访问的是“class类”中的属性, 毕竟是有就近原则的!
        String name = "Tom";
        System.out.println("name = " + name + " age = " + age);
        System.out.println("name = " + this.name + " age = " + this.age);
    }
}

class Duck {
    String name;
    int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Duck d) {
//        if (this.name.equals(d.name) && this.age == d.age) {
//            return true;
//        } else {
//            return false;
//        }
        return this.name.equals(d.name) && this.age == d.age;
    }
}