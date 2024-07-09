public class migong_11 {
    public static void main(String[] args) {

        int[][] map = new int[8][7];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == 0 || i == 7) {
                    map[i][j] = 1;
                } else if (j == 0 || j == 6) {
                    map[i][j] = 1;
                } else if ((i == 3 && j == 1) || (i == 3 && j == 2)) {
                    map[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        TT t1 = new TT();
        boolean b = t1.findWay(map, 1, 1);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class TT {
    //使用递归回溯的思想来解决老鼠出迷宫

    //老韩解读
    //1. findWay方法就是专门来找出迷宫的路径
    //2. 如果找到，就返回 true ,否则返回false
    //3. map 就是二维数组，即表示迷宫
    //4. i,j 就是老鼠的位置，初始化的位置为(1,1)
    //5. 因为我们是递归的找路，所以我先规定 map数组的各个值的含义
    //   0 表示可以走 1 表示障碍物 2 表示(你已经走过了)可以走 3 表示走过，但是走不通是死路
    //6. 当map[6][5] =2 就说明找到通路,就可以结束，否则就继续找.
    //7. 先确定老鼠找路策略 下->右->上->左
    public boolean findWay(int[][] map , int i, int j) {
        if(map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if(map[i][j] == 0) {//当前这个位置0,说明表示可以走
                //我们假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下->右->上->左
                if(findWay(map, i + 1, j)) {//先走下
                    return true;
                } else if(findWay(map, i, j + 1)){//右
                    return true;
                } else if(findWay(map, i-1, j)) {//上
                    return true;
                } else if(findWay(map, i, j-1)){//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else { //map[i][j] = 1 , 2, 3
                return false;
            }
        }
    }
}