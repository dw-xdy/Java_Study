public class continue_10 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 4) {
//            i++;
//            if (i == 2) {
//                continue;
//            }
//            System.out.println("i = " + i);
//         }

        //continue 细节
        label1:
        for(int j = 0; j < 2; j++){
            label2:
            for(int i = 0; i < 10; i++){
                if(i == 2){
                    //看看分别输出什么值，并分析
                    //continue ; //等价于 continue label2
                    //continue label2;//等价 continue;
                    continue label1; //输出 2次[0,1]
                }
                System.out.println("i = " + i);//输出2次[0,1,3,4,5,6,7,8,9]
            }
        }

    }
 }
