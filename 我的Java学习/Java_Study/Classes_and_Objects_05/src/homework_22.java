public class homework_22 {
    public static void main(String[] args) {
        A03 a = new A03();
        int[] arr = {1, 34, 5, 6, 54, 43};
        int[] newarr = a .copyArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}


class A03 {
    public int[] copyArr(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}