package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对.");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);
            System.out.println("res = " + res);

        } catch (NumberFormatException e) {
            System.out.println("数字格式不对");
        } catch (ArithmeticException e) {
            System.out.println("除数不对");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}


