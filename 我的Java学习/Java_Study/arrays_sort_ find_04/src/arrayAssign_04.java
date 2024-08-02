public class arrayAssign_04 {
    public static void main(String[] args) {
//        //基本数据类型赋值, 赋值方式为值拷贝
//        //n2的变化，不会影响到n1的值
//        int n1 = 10;
//        int n2 = n1;
//
//        n2 = 80;
//        System.out.println("n1=" + n1);//10
//        System.out.println("n2=" + n2);//80
//
//        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用赋值
//        //是一个地址 , arr2变化会影响到 arr1
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = arr1;//把 arr1赋给 arr2
//        arr2[0] = 10;
//
//        //看看arr1的值
//        System.out.println("====arr1的元素====");
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);//10, 2, 3
//        }
//
//        System.out.println("====arr2的元素====");
//        for(int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);//10, 2, 3
//        }

//        int arr1[] = {10, 20, 30};
//        int arr2[] = new int[arr1.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//        arr2[1] = 899;
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr1[i]);
//        }


        //老师的版本
//        将 int[] arr1 = {10,20,30}; 拷贝到 arr2数组,
//        要求数据空间是独立的.

        int[] arr1 = {10,20,30};
        //创建一个新的数组arr2,开辟新的数据空间
        //大小 arr1.length;
        int[] arr2 = new int[arr1.length];

        //遍历 arr1 ，把每个元素拷贝到arr2对应的元素位置
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //老师修改 arr2， 不会对arr1有影响.
        arr2[0] = 100;

        //输出arr1
        System.out.println("====arr1的元素====");
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//10,20,30
        }

        //
        System.out.println("====arr2的元素====");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);//
        }
    }
}

