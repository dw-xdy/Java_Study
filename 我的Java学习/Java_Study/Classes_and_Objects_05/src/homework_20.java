public class homework_20 {
    public static void main(String[] args) {
        // homework 2
        String[] arr2 = {"fdsa", "uiyoteprwq", "feng", "kaishi"};
        A02 A2 = new A02();
        String name = "kaishi";
        System.out.println(A2.find(name, arr2));
    }
}

class A02 {
    public int find(String findString, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findString.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}