package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "f98YGU";
        char[] chars = str.toCharArray();
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                count++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                count1++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                count2++;
            }
        }

        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
    }
}
