public class homework_24 {
    public static void main(String[] args) {
        Cale C1 = new Cale(12, 2);
        Cale C2 = new Cale(12, 2);

        System.out.println(C1.sub());
        Double divRes = C2.div();
        if (divRes != 0) {
            System.out.println(C2.div());
        }

    }
}


class Cale {
    int n1;
    int n2;

    public Cale(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int add() {
        return n1 + n2;
    }

    public int sub() {
        return n1 - n2;
    }

    public double mult() {
        return n1 * n2;
    }

    public Double div() {
        if (n2 == 0) {
            System.out.println("除数为零, 重新输入");
            return null;
        } else {
            return (double)n1 / n2;
        }
    }
}