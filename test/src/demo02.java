import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        //输入多个数字，并求其总和和平均数，没输入一个数字回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入的数据数字总数
        int m = 0;

        System.out.println("输入数字，以非数字结尾！");

        //通过循环判断是否还有输入，并且对总数进行统计，并求总和
        while (scanner.hasNextDouble()){
            m++;
            sum += scanner.nextDouble();
        }

        System.out.println("总和是："+ sum);
        System.out.println("平均数是："+ (sum/m));

        scanner.close();
    }
}
