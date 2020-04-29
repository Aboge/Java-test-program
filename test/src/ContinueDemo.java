public class ContinueDemo {
    public static void main(String[] args) {
        //continue语句的用法

        int i = 0;
        while (i < 10){
            i++;
            if (i%3 == 0){
                System.out.println();
                continue;                   //continue跳过后面的方法语句，直接回到上一层的方法继续执行
            }
            System.out.println(i);
        }


        //break在任何循环语句的主体部分，均可用break控制循环的流程
        //break可以用于强行退出循环体，终止循环（也可以在switch语句中）
        //continue用在循环语句中，用于终止某次循环过程，跳过循环体中还未执行的语句，接着进行下一次是否执行循环的判定
    }
}
