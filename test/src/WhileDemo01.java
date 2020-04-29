public class WhileDemo01 {
    public static void main(String[] args) {
        //输出1-100
        int i = 0;
        int sum = 0;

        while (i < 100){
            i++;
//            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
        System.out.println("-----------");

        do {
            i++;
            System.out.println(i);
        }while (i < 100);

    }
}
