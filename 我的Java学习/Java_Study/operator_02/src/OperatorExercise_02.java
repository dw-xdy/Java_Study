//这里是一个比较重要的知识点, 以前都没有注意过, 所以这个要进行记忆
public class OperatorExercise_02 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
//        这行代码使用了后缀自增操作符 i++。后缀自增操作符的工作原理是：
//        首先返回变量的当前值，然后再将变量的值加 1。具体步骤如下：
//        返回 i 的当前值（即 1）。      tmp = i;
//        将 i 的值加 1（即 i 变为 2）。 i = i + 1;
//        将返回的值（即 1）赋值给 i。    i = tmp;
//        因此，这行代码执行后，i 的值仍然是 1。
        System.out.println(i);

        int j = 1;
        j = ++j;
//        这行代码使用了前缀自增操作符 ++i。前缀自增操作符的工作原理是：
//        首先将变量的值加 1，然后返回变量的新值。具体步骤如下：
//        将 i 的值加 1（即 i 变为 2）。  i = i + 1;
//        返回 i 的新值（即 2）。         tmp = i;
//        将返回的值（即 2）赋值给 i。     i = tmp;
//        因此，这行代码执行后，i 的值变为 2。
        System.out.println(j);

        int n = 9;
        int m = n++; 
        //tmp = n;   n先有一个返回值, 
        //n = n + 1;   然后将n本身进行加一
        //m = tmp;     最后将返回值赋给m

        //其实最后无非就是先有返回值还是先进行+1;
        System.out.println(m);


        int x = 9;
        int y = ++x;
        //先进行++ ：x = x + 1;
        //然后进行一个返回值 tmp = x;
        //最后将返回值赋值给y：y = tmp;
        System.out.println(y);
    }
}
