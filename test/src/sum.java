public class sum {
    //计算100以内的偶数和和奇数和
    public static void main(String[] args) {
        int oddsum = 0;
        int evensum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){
                oddsum += i;
            }else {
                evensum += i;
            }
        }

        System.out.println("偶数和是：" + oddsum);
        System.out.println("奇数和是：" + evensum);
    }
}
