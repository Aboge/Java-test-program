public class ForDemo02 {
    //练习：用while或for循环输出1-1000之间能被5整除，并且每行输出3个

    public static void main(String[] args) {

        System.out.println("1000以内可以被5整除的数：");

        for (int i = 1; i < 1000; i++) {

            if (i%5 == 0){
                System.out.print(i+"\t");
            }
            if (i%(3*5) == 0){            //没输出3个后进行换行
                System.out.print("\n");
            }
        }

        //println 输出后会自动换行
        //print 输出不会换行也不会空格
        //printf("%d",i)

    }
}
