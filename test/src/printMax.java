public class printMax {
    //利用可变参数方法来进行传参
    public static void main(String[] args) {
        printMax(10.5,20,30,40,11);
    }

    public static void printMax(double...numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        //设置默认值
        double result = numbers[0];

        //排序
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The max value is:" + result);
    }
}
