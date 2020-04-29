import java.util.Scanner;

public class demo03 {
    //case穿透
    //switch匹配一个具体的值
    public static void main(String[] args) {
        System.out.println("请输入成绩等级：");

        Scanner scanner = new Scanner(System.in);

        String c = scanner.next();

        System.out.println(c);

        if (c != null){
            switch (c){
                case "A" :
                    System.out.println("优秀");
                    break;
                case "B" :
                    System.out.println("良");
                    break;
                case "C" :
                    System.out.println("差");
                    break;
                default:
                    System.out.println("未知成绩！");
                    break;
            }
        }

        scanner.close();
    }
}
