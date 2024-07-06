import java.util.Objects;
import java.util.Scanner;
public class break_09 {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; ; i++) {
//            int number = (int)(Math.random() * 100) + 1;
//            count++;
//            System.out.println(number);
//            if (number == 97) {
//                System.out.println(count);
//            }
//        }

//        for( int i = 0; i < 10; i++) {
//            if( i == 3) {
//                break ;
//            }
//            System.out.println("i=" + i);
//        }
//
//        System.out.println("退出for循环, 继续执行..");

        // homework 1
        //1-100以内的数求和，求出 当和 第一次大于20的当前数 【for + break】

        //思路分析
        //1. 循环 1-100, 求和 sum
        //2. 当 sum > 20 时，记录下当前数，然后break
        //3. 在for循环外部，定义变量 n , 把当前i 赋给 n
//        int sum = 0; //累积和

        //注意i 的作用范围在 for{}
//        int n = 0;
//        for(int i = 1; i <= 100; i++) {
//            sum += i;//累积
//            if(sum > 20) {
//                System.out.println("和>20时候 当前数i=" + i);
//                n = i;
//                break;
//            }
//        }
//
//        System.out.println("当前数=" + n);

        //homework 2 我的版本
//        Scanner input = new Scanner(System.in);
//        int count = 3;
//        String name;
//        String password = "\0";
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入用户名：");
//            name = input.next();
//            if (!Objects.equals(name, "丁真")) {
//                count--;
//                System.out.println("还有" + count + "次机会");
//            } else {
//                System.out.println("请输入密码：");
//                password = input.next();
//                if (!Objects.equals(password, "666")) {
//                    count--;
//                    System.out.println("还有" + count + "次机会");
//                } else {
//                    System.out.println("登录成功");
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("登录失败");
//                break;
//            }
//
//        }

        // String name = "林黛玉";
        // System.out.println(name.equals("林黛玉"));//T
        // System.out.println("林黛玉".equals(name));//T [推荐, 可以避免空指针]

        Scanner myScanner  = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3; //登录一次 ，就减少一次
        for(int i = 1; i <= 3; i++) {//3次登录机会
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            //比较输入的名字和密码是否正确
            //补充说明字符串 的内容 比较 使用的 方法 equals
            if("丁真".equals(name) && "666".equals(passwd)) {
                System.out.println("恭喜你，登录成功~");
                break;
            }

            //登录的机会就减少一次
            chance--;
            System.out.println("你还有" + chance + "次登录机会");

        }

    }
}



