package com.fxw.stringbuffer_;

import java.util.Scanner;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuffer stringBuffer = new StringBuffer(input);
        //
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0 ; i -= 3) {
            stringBuffer.insert(i, ",");
        }
        System.out.println(stringBuffer);
    }
}
