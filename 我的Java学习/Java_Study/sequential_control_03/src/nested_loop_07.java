import java.util.Scanner;
public class nested_loop_07 {
    public static void main(String[] args) {
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("i=" + i + "j=" + j);
//            }

        // homework 1
//        Scanner input = new Scanner(System.in);
//        int score;
//        int sum1 = 0;
//        int sum2 = 0;
//        int count = 0;
//        double average1;
//        double average2;
//        for (int i = 1; i <= 3; i++) {
//            sum1 = 0;
//            for (int j = 1; j <= 5; j++) {
//                score = input.nextInt();
//                if (score >= 60) {
//                    count++;
//                }
//                sum1 += score;
//            }
//            average1 = sum1 * 1.0 / 5;
//            sum2 += sum1;
//            System.out.printf("第%d个班级的平均分为：%f", i, average1);
//        }
//
//        average2 = sum2 * 1.0 / 15;
//        System.out.println("所有学生的平均分是：" + average2);
//        System.out.println("及格人数为：" + count);

        // homework 2：打印99乘法表
        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %-4d", j, i, i * j);
            }
            System.out.println();
        }
    }
}



