
public class ForceConvert_03 {

    //编写一个main方法
    public static void main(String[] args) {

        //演示强制类型转换
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1, 造成精度损失

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//造成 数据溢出
        System.out.printf("b1 = %d\n", b1);

        //演示强制类型转换
        //强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        //int x = (int)10*3.5+6*1.5;//编译错误： double -> int
        int x = (int)(10*3.5+6*1.5);// (int)44.0 -> 44
        System.out.println(x);//44


        char c1 = 'd'; //ok
        System.out.println(c1);
        System.out.printf("%d\n", (int)c1);
        int m = 100; //ok
        //char c2 = m; //错误 原因：char类型的无法保存int类型的变量
        char c3 = (char)m; //ok
        System.out.println(c3);//100对应的字符, d字符

    }
}



