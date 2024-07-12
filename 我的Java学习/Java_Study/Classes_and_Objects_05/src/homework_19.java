public class homework_19 {
    public static void main(String[] args) {
        // homework 1
        double[] arr1 = {1.4, 7.6, 5.4, 6.3, 7.6};
        A01 A1 = new A01();
        Double res = A1.max(arr1);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("输入有误");
        }
    }
}


class A01 {
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }
}



