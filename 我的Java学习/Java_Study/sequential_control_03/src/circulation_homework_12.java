import java.util.Scanner;
public class circulation_homework_12 {
    public static void main(String[] args) {

        // homework 1
//        int count = 0;
//        double cash = 100000;
//
//        while (cash > 0) {
//            if (cash > 50000) {
//                cash *= 0.95;
//                count++;
//            } else if (cash >= 1000) {
//                cash -= 1000;
//                count++;
//            }
//            if (cash < 1000) {
//                break;
//            }
//        }
//        System.out.println(count);


//        // homework 2
//        Scanner input = new Scanner(System.in);
//
//        int integer = input.nextInt();
//        if (integer > 0) {
//            System.out.println("该数大于0");
//        } else if (integer == 0) {
//            System.out.println("该数小于0");
//        } else {
//            System.out.println("该数等于0");
//        }
//
//        // homework 3
//        int year = input.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("是");
//        } else {
//            System.out.println("不是");
//        }
//
//        //homework 4
//        int number = input.nextInt();
//
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 0; j <= 9; j++) {
//                for (int k = 0; k <= 9; k++) {
//                    if (i * 100 + j * 10 + k == number) {
//                        System.out.println("是水仙花数");
//                    } else {
//                        System.out.println("不是水仙花数");
//                    }
//                }
//            }
//        }

        //homework 5
//        一个编程判断题
        // homework 6
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 != 0) {
//                System.out.print(i + " ");
//                count++;
//                if (count % 5 == 0) {
//                    System.out.println();
//                }
//            }
//        }

        //homework 7
//        for (int i = 'a'; i <= 'z'; i++) {
//            System.out.println((char)i + " ");
//        }
//        System.out.println();
//        for (int i = 'Z'; i >= 'A'; i--) {
//            System.out.println((char)i + " ");
//        }

        //homework 8 (我的做法)
//        double sum1 = 0;
//        double sum2 = 0;
//        int i, j;
//        for (i = 1; i <= 100; i += 2) {
//            sum1 += 1 / (double)i;
//        }
//        for (j = 2; j <= 100; j += 2) {
//            sum2 += 1 / (double)j;
//        }
//        System.out.println(sum1 - sum2);

        //(老师的做法)
//        double sum = 0;
//        for(int i = 1; i <= 100; i++) {
//            //判断是奇数还是偶数，然后做不同的处理
//            if( i % 2 != 0) {//分母为奇数
//                sum += 1.0/i;
//            } else { //分母我偶数
//                sum -= 1.0/i;
//            }
//        }
//
//        System.out.println("sum=" + sum);

        //homework 9
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }


        System.out.println(sum);


    }
}
