public class Ternary_Operator_Detail_12 {
    public static void main(String[] args) {
        //表达式1和表达式2要为可以赋给接收变量的类型
        //(或可以自动转换/或者强制转换)
        int a = 3;
        int b = 8;
        int c = a > b ? (int) 1.1 : (int) 3.4;//可以的 (原因：double类型不能用int类型接收)
        double d = a > b ? a : b + 3;//可以的，满足 int -> double

        int n1 = 553;
        int n2 = 3366;
        int n3 = 123;

        int max = (n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3));
        System.out.println(max);

    }
}
