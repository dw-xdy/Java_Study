package com.fxw.pkg;

import java.util.Arrays;

//注意:
//老韩建议：我们需要使用到哪个类，就导入哪个类即可，不建议使用 *导入
//import java.util.Scanner; //表示只会引入java.util 包下的 Scanner
//import java.util.*;//表示将java.util 包下的所有类都引入(导入)
public class Import_01 {
    public static void main(String[] args) {
        int[] arr = {-1, 32, 34, 55, 23, 33};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
