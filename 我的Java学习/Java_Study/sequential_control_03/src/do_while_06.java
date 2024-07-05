import java.util.Scanner;
public class do_while_06 {
    public static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println("kaishijinxgin" + i);
//            i++;
//        } while (i <= 10);

        //homework 1
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 100);

        //homework 2
//        int i = 1;
//        int sum = 0;
//        do {
//            sum += i;
//            i++;
//        } while (i <= 100);
//        System.out.println(sum);

        //homework 3
//        int i = 0;
//        int count = 0;
//        do {
//            if (i % 5 == 0 && i % 3 != 0) {
//                count++;
//            }
//            i++;
//        } while (i <= 200);
//        System.out.println(count);

        //homework 4 (我的版本)
//        Scanner input = new Scanner(System.in);
//        char answer;
//        do {
//            System.out.println("老韩使用五连鞭");
//            System.out.println("请输入y / n");
//            answer = input.next().charAt(0);
//        } while (answer != 'y');


        // 老师的实现：
        //如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为
        //[System.out.println("老韩问：还钱吗？y/n")]   do...while ..
        //
        //化繁为简
        //(1) 不停的问还钱吗?
        //(2) 使用char answer 接收回答, 定义一个Scanner对象
        //(3) 在do-while 的while 判断如果是 y 就不在循环
        //一定自己动脑筋..
        Scanner myScanner  = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("老韩使出五连鞭~");
            System.out.println("老韩问：还钱吗？y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        }while(answer != 'y');//判断条件很关键

        System.out.println("李三还钱了");
    }
}
