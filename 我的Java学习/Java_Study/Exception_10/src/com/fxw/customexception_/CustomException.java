package com.fxw.customexception_;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {

        int age = 432;
        if (!(age >= 18 && age <= 80)) {
            throw new AgeException("年龄需要在18 ~ 120之间");
        }
        System.out.println("你输入的年龄正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}