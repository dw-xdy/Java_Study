public class Rescursion_10 {
    public static void main(String[] args) {
        T t = new T();
//        t.test(5);
        System.out.println("zuihou c " + t.test1(5));
        System.out.println("kahsihizg" + t.test2(5));
        long Fib = t.Fib(6);
        System.out.println("Fib = " + Fib);
        int Peach = t.monkey(1);
        System.out.println("Peach = " + Peach);
    }
}


class T {
    public void test(int n) {
        if (n > 2) {
            test(n -1);
        }
        System.out.println("n = " + n);
    }

    public int test1(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public int test2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * test2(n - 1);
        }
    }

    public long Fib(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fib(n - 1) + Fib(n - 2);
            }
        } else {
            System.out.println("wnejighg");
            return -1;
        }
    }

    public int monkey(int n) {
        if (n == 10) {
            return 1;
        } else {
            return 2 * (monkey(n + 1) + 1);
        }
    }
}