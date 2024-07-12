//package的作用是声明当前类所在的包，需要放在类(或者文件)的最上面，
// 一个类中最多只有一句package
package com.fxw.pkg;

//import指令 位置放在package的下面，在类定义前面,可以有多句且没有顺序要求
import java.util.Scanner;

public class PekDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}



