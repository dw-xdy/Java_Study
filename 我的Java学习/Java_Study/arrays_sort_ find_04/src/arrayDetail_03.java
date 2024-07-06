public class arrayDetail_03 {
    public static void main(String[] args) {
//        //1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理
//
//        //int[] arr1 = {1, 2, 3, 60,"hello"};//String ->int
//        double[] arr2 = {1.1, 2.2, 3.3, 60.6, 100};//int ->double
//
//        //2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
//        String[] arr3 = {"北京","jack","milan"};
//
//        //3. 数组创建后，如果没有赋值，有默认值
//        //int 	0，short 0, byte 0, long 0,
//        //float 0.0,double 0.0，char \u0000，
//        //boolean false，String null
//        //
//        short[] arr4 = new short[3];
//        System.out.println("=====数组arr4=====");
//        for(int i = 0; i < arr4.length; i++) {
//            System.out.println(arr4[i]);
//        }
//
//        //6. 数组下标必须在指定范围内使用，否则报：下标越界异常，比如
//        //int [] arr=new int[5]; 则有效下标为 0-4
//        //即数组的下标/索引 最小 0 最大 数组长度-1(4)
//        int [] arr = new int[5];
//        //System.out.println(arr[5]);//数组越界


        //homework 1 我的版本
//        char letter[] = new char[26];
//        char number = 'A';
//        for (int i = 0; i < letter.length; i++, number++) {
//            letter[i] = number;
//            System.out.println(letter[i]);
//        }

        //老师的版本
//        char[] chars = new char[26];
//        for( int i = 0; i < chars.length; i++) {//循环26次
//            //chars 是 char[]
//            //chars[i] 是 char
//            chars[i] = (char)('A' + i); //'A' + i 是int , 需要强制转换
//        }
        //循环输出
//        System.out.println("===chars数组===");
//        for( int i = 0; i < chars.length; i++) {//循环26次
//            System.out.print(chars[i] + " ");
//        }


        //homework 2 (我的版本)
//        int number[] = {4, -1, 9, 10, 23};
//        int n = 0;
//        for (int i = 1; i < number.length; i++) {
//            if (number[n] < number[i]) {
//                n = i;
//            }
//        }
//        System.out.println(number[n]);
//        System.out.println(n);

        //老师的版本
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];//假定第一个元素就是最大值
        int maxIndex = 0; //

        for(int i = 1; i < arr.length; i++) {//从下标 1 开始遍历arr

            if(max < arr[i]) {//如果max < 当前元素
                max = arr[i]; //把max 设置成 当前元素
                maxIndex = i;
            }
        }
        //当我们遍历这个数组arr后 , max就是真正的最大值，maxIndex最大值下标
        System.out.println("max=" + max + " maxIndex=" + maxIndex);

    }
}
