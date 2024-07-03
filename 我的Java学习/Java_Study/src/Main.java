
// public class Main 表示Main是一个类(一个公共)类, public表示是一个公共的类.
public class Main {
    // public static void main(String[] args)表示一个主方法, 是程序进入的入口
    public static void main(String[] args) {
//        int res = 1 + 1;
//        System.out.println("结果是：" + res); //println中ln的意思是进行换行, print是没有换行这个功能的!
        //写一个冒泡排序.(java版的)
//        int[] arr = {12, 432, 543, 345, 5, 34, 43, 4, 35, 33};
//
//        for (int i = 0; i < 10 - 1; i++) {
//            for (int j = 0; j < 10 - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(arr[i]);
//        }
        //转义字符的使用(我会了已经, 所以这里就不多学习了)
        //System.out.println("一个最好\n的学习时期\t开始\\了");
        //转义字符的使用中只有“\r”(回车)比较难理解, 但是我感觉自己也理解了, 而且基本上也有点用不上啊
        System.out.println("韩顺平教育\r背景");

    }
}

//一个源文件中最多只能有一个public类, 其他类的个数是不限的
//一个源文件中最多只能有一个public类。其它类的个数不限，也可以将main方法写在非
//也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法
class Dog {
    public static void main(String[] args) {
        System.out.println("你好, 小狗狗");
    }
}





















