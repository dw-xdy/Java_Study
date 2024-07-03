
public class StringToBasic_04 {

    //编写一个main方法
    public static void main(String[] args) {

        //基本数据类型->String

        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String->对应的基本数据类型
        String s5 = "123";
        //会在OOP 讲对象和方法的时候回详细
        //解读 使用 基本数据类型对应的包装类，的相应方法，得到基本数据类型
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);
        // 注意，char 这种基本类型是用字符数组 char[] 来承接（因此没有parseChar方法）

        System.out.println("===================");
        System.out.println(num1);//123
        System.out.println(num2);//123.0
        System.out.println(num3);//123.0
        System.out.println(num4);//123
        System.out.println(num5);//123
        System.out.println(num6);//123
        System.out.println(b);//true

        //怎么把字符串转成字符char -> 含义是指 把字符串的第一个字符得到
        //解读  s5.charAt(0) 得到 s5字符串的第一个字符 '1'
        System.out.println(s5.charAt(0));

        //homework2
        char a = '\n';
        char c = '\t';
        char d = '\r';
        char e = '\\';
        char f = '1';
        char g = '2';
        char h = '3';

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


        //homework3
        String name1 = "三国演义";
        String name2 = "黑神话";
        System.out.println(name1 + name2);

        char gender1 = '男';
        char gender2 = '女';
        System.out.println(gender1 + gender2);

        char price1 = 65;
        char price2 = 65;
        System.out.println(price2 + price1);

        String name3 = "冯肖伟";
        int age = 19;
        int score = 100;
        char gender = '男';
        String lover = "编程";

        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"
                + name3 + '\t' + age + '\t' + score + '\t' + gender + '\t' + lover);


        int n = 100;
        System.out.println("n = " + n);  //不要对“+”有什么不对的印象, 都是


        //homework4
    }
}