
/**
 * @author 冯肖伟
 * @version 1.0
 */
public class variable_01 {
    public static void main(String[] args) {
//        int a = 100;
//        int b = 234;
//        System.out.println(a);
//        System.out.println(b);

//        int age = 19;
//        double score = 99.3;
//        char gender = '男';
//        String name = "king";
//
//        System.out.println(age);
//        System.out.println(score);
//        System.out.println(gender);
//        System.out.println(name);

//        System.out.println(100 + 98);
//        System.out.println("100" + 98);
//        System.out.println(100 + 3 + "hello");
//        System.out.println("hello" + 100 + 3);

//        byte n1= 43;
//        int n2 = 100;
//        long n3 = 23489; // 这个数值在int范围内，不会报错
//        long n4 = 2147483648; // 这个数值超出了int范围，编译器会报错
//
//        System.out.println(n1);
//        System.out.println(n3);

//        float num = 1.99F;
//
//        double n1 = 2.7;
//        double n2 = 8.1 / 3;
//
//        System.out.println(n1);
//        System.out.println(n2);
//        //可以根据自己在工作中的实际情况来进行一个精度的比较, 确定一个精度就行.
//        if (Math.abs(n1 - n2) < 0.00000001) {
//            System.out.println("相等");
//        }
//        我全试过了，只有小数除以3或者除以9的时候是除不尽的！



//        char c1 = 'a';
//        char c2 = '\t'; //这是个制表符
//        char c3 = '开';
//        char c4 = 97;
//
//        System.out.println((int)c1); //有需要可以将对应的“字符”打印为对应的“数字”, 但是要加上int(强制转换)
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//
//        //char类型也是可以进行运算的
//        System.out.println('a' + 100);  //这里需要注意, 字符本身会转换成Unicode编码对应的数字
//        System.out.println("adsgajkhh" + 199999); //这里是字符串, 不是字符,所以进行的是拼接运算
//
//        char c5 = 'b' + 1;
//        System.out.println((int)c5); //99
//        System.out.println(c5);     //c


        // 不可以0或非0的整数替代false和true,这点和C语言不同
        // 比如C语言中可以使用“while(1)”表示真,但是Java语言不行
//        boolean is = false;
//        if (is) {
//            System.out.println("kshiotgnsdfjhfsd");
//        } else {
//            System.out.println("kaoshidsgjhasdhfjskdajfkajsadf");
//        }

//        int n1 = 'a';
//        double n2 = 90;
//
//        System.out.println("你好");
//        System.out.println(n2);

        int n1 = 10;
        float n2 = 'a' + 1.1F;

        System.out.println(n2);

//        double n3 = 0.1;
//        System.out.println(n3);
        double n3 = 8.1 / 3;
        System.out.printf("%.100f\n", n3); // 打印50位小数



    }
}
