package com.fxw.string_;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp"; //a 指向 常量池的 “hsp”
        String b =new String("hsp");//b 指向堆中对象
        System.out.println(a.equals(b)); //T
        System.out.println(a==b); //F
        //b.intern() 方法返回常量池地址
        System.out.println(a==b.intern()); //T //intern方法自己先查看API
        System.out.println(b==b.intern()); //F
        // intern方法返回的是“常量池”中的“地址”, 所以, 只有在“常量池”中直接创建的地址的a可以对应.
        // “a”指向的就是“常量池”的地址, 但是“b”指向的是“堆”中的“value地址”.
    }
}

