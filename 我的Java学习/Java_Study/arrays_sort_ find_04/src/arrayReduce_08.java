import java.util.Scanner;
public class arrayReduce_08 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};

        while (true) {
            int arr1[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            if (arr.length == 1) {
                break;
            }
            System.out.println("请输入y/n");
            char key = input.next().charAt(0);
            if (key == 'n') {
                break;
            }
        }


    }
}
