import java.util.Scanner;
public class SwitchExercise_03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

//        char letter = myScanner.next().charAt(0);
//        switch (letter) {
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");

        // homework 2
//        int score = myScanner.nextInt();
//        int a = score / 60;
//        switch (a) {
//            case 1:
//                System.out.println("及格");
//                break;
//            case 0:
//                System.out.println("不及格");
//                break;
//            default:
//                System.out.println("请重新输入");

        // homework 3

        int month = myScanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请重新输入");
        }
    }
}
