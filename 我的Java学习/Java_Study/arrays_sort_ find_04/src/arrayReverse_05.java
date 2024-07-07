public class arrayReverse_05 {
    public static void main(String args[]) {
        //数组的翻转 (第一个做法)
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println(arr.length);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 数组翻转 (第二个做法)
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = new int[arr1.length];

        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = arr1[arr1.length - i - 1];
        }
        arr1 = arr2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
