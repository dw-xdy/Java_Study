package com.fxw.try_;

import java.util.Scanner;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String str;
        System.out.println("请输入一个整数：");
        while (true) {
            str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请重新输入数字：");
            }
        }

        System.out.println(num);
    }
}
