public class variable_parameter_14 {
    public static void main(String[] args) {
        HspMethod m = new HspMethod();
//        System.out.println(m.sum(1, 2, 3));
        System.out.println(m.showScore("冯肖伟", 1, 2, 3, 50));
    }
}

class HspMethod {
    public int sum(int... nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
    public String showScore(String name, double... score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return name + sum;
    }
}