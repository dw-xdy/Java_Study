import java.util.Scanner;
public class TwoDimensalArrayHomework_13 {
    public static void main(String args[]) {
        //homework 1
//        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);

        //homework 2 (杨辉三角, 我的做法)
//        int yanghui[][] = new int[10][];
//
//        for (int i = 0; i < yanghui.length; i++) {
//            yanghui[i] = new int[i + 1];
//            for (int j = 0; j < yanghui[i].length; j++) {
//                if (i == j || j == 0) {
//                    yanghui[i][j] = 1;
//                } else {
//                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < yanghui.length; i++) {
//            for (int j = 0; j < yanghui[i].length; j++) {
//                System.out.print(yanghui[i][j] + " ");
//            }
//            System.out.println();
//        }

        // homework 3
        /*这个题目的思路：
        1. 先输入一个数字 arrNew
        2. 然后将 arr[i] 的值赋值给 arr1[i], 直到出现第一个数字比 `arrNew` 大,
        3. 然后将 arrNew 赋值给 arr[i];
        4. 然后将剩下的 arr[i] 中的值赋值给 arr1[i + 1], (因为 arrNew 已经占用了一个 i 了)
        5. 然后将 arr1 (的地址)赋值给 arr;
        6. 最后将 arr 的值进行“遍历”输出 */
//        Scanner input = new Scanner(System.in);
//        int arr[] = {10, 12, 45, 90};
//        int arr1[] = new int[arr.length + 1];
//        int arrNew = input.nextInt();
//
//        int i;
//        for (i = 0; i < arr.length && arrNew > arr[i]; i++) {
//            arr1[i] = arr[i];
//        }
//        arr1[i] = arrNew;
//        for (; i < arr.length; i++) {
//            arr1[i + 1] = arr[i];
//        }
//
//        arr = arr1;
//        for (i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //homework 4
        int number;
        int sum = 0;
        double average;
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            number = (int)(Math.random() * 100) + 1;
            arr[i] = number;
            sum += arr[i];
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        average = sum / 10.0;
        System.out.println("average = " + average);

        int max = arr[0];
        int n = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                n = i;
            }
            if (arr[i] == 8) {
                System.out.println("有");
            }
        }
        System.out.println("最大值为：" + arr[n] + ", 最大值的下标为：" + n);
    }
}
