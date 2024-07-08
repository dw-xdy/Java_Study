public class methodDetail_06 {
    public static void main(String[] args) {
        A a = new A();
//        a.print(100);
//        a.sayOk();
        a.m1();

    }
}


class A {
    public void print(int n) {
        System.out.println("kongzhihaozii " + n);
    }
    public void sayOk() {
        print(10);
    }

    public void m1() {
        System.out.println("m1方法被调用");
        BB b = new BB();
        b.hi();
        System.out.println("B类中的hi()方法被调用了");
    }
}


class BB {
    public void hi() {
        System.out.println("B类中的hi()被执行了");
    }
}