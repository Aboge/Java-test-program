import java.util.Scanner;

public class domo01 {
    public static void main(String[] args) {
        System.out.printf("Hello worlld!");

        //接收键盘输入数据
        Scanner scanner = new Scanner(System.in);

        System.out.printf("使用next方式接收！请输入字符：");//使用next方式接收！只接收空格号之前的数据

        //判断用户是否有输入字符串
        /*if (scanner != null) {
            String str = scanner.next();
            System.out.println(str);
        }*/

        if (scanner.hasNext()){
            String str1 = scanner.next();
            System.out.println(str1);
        }


        System.out.println("采用nextline接收下一行中所有的输入的内容：");//使用nextline方式接收回车符之前输入的数据

        Scanner scanner1 = new Scanner(System.in);
        if (scanner1.hasNextLine()){
            String s = scanner1.nextLine();
            System.out.println(s);
        }


        scanner.close();//关闭IO流，不关闭会一直占用资源
    }
}
