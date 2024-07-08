public class method_04 {
    public static void main(String[] args) {
        myTools t1 = new myTools();
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        t1.print(map);
    }
}

class myTools {
    public void print(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}