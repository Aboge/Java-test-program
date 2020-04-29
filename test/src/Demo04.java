public class Demo04 {
    public static void main(String[] args) {
        int result = jiecheng(10);
        System.out.println("10的阶乘结果是：" + result);


    }

    //用递归实现的阶乘
    public static int jiecheng(int i){
        if (i == 1){
            return i;
        }else {
            return (i*jiecheng(i-1));
        }
    }
}
