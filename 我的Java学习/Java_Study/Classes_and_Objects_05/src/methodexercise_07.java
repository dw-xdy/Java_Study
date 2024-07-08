public class methodexercise_07 {
    public static void main(String[] args) {
        AAA a = new AAA();
//        System.out.println(a.judgeOdd(10));
        a.print(3, 4, '*');
    }
}


class AAA {
    public boolean judgeOdd(int n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print(int n1, int n2, char c) {
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}