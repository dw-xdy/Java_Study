public class This_17 {
    public static void main(String[] args) {

        tiger tiger1 = new tiger("tom", 4);
//        tiger1.info();
        System.out.println("tiger1的hashcode = " + tiger1.hashCode());
        tiger tiger2 = new tiger("tom", 4);
//        tiger2.info();
        System.out.println("tiger2的hashcode = " + tiger2.hashCode());
    }
}


class tiger {
    String name;
    int age;
    // public Dog(String dName, int  dAge){//构造器
    // 	name = dName;
    // 	age = dAge;
    // }
    //如果我们构造器的形参，能够直接写成属性名，就更好了
    //但是出现了一个问题，根据变量的作用域原则
    //构造器的name 是局部变量，而不是属性
    //构造器的age  是局部变量，而不是属性
    //==> 引出this关键字来解决
    public tiger(String name, int  age){//构造器
        //this.name 就是当前对象的属性name
        this.name = name;
        //this.age 就是当前对象的属性age
        this.age = age;
        System.out.println("this.hashCode=" + this.hashCode());
    }

    public void info(){//成员方法,输出属性x信息
        System.out.println("this.hashCode=" + this.hashCode());
        System.out.println(name + "\t" + age + "\t");
    }
}