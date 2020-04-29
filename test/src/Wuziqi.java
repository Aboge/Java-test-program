public class Wuziqi {
    public static void main(String[] args) {

        //1.创建一个二维数组11*11
        //0：没有棋子    1：黑棋     2：白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        //输出原始数组
        System.out.println("输出原始数组!");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println( );
        }

        System.out.println("-----------------------------");

        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效个数是：" + sum);

        //2.创建一个稀疏数组的数组
        int[][] array2 = new int[sum+1][3]; //创建sum+1行来记录sum条数据记录，三列分别记录原数据的所在行，所在列，数据值

        //初始记录稀疏数组的数据信息
        array2[0][0] = 11;   //记录该二维数组有11行
        array2[0][1] = 11;   //记录二维数组一共有11列
        array2[0][2] = sum;  //记录二维数组一共有sum个有效的数据

        //遍历二维数组，将非0的值存放到稀疏数组中
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0){
                    count++;
                    array2[count][0] = i;  //记录当前有效数据的行号
                    array2[count][1] = j;  //记录当前有效数据的列号
                    array2[count][2] = array1[i][j];  //记录当前有效数据的值
                }
            }
        }

        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        //稀疏数组的还原
        System.out.println("还原：");
        //1。读取稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        //2.给其中的元素还原其值
        /*for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                if (i == array2[1][0] && j == array2[1][1]){
                    array3[i][j] = array2[1][2];
                }else if (i == array2[2][0] && j == array2[2][1]){
                    array3[i][j] = array2[2][2];
                }else {
                    array3[i][j] = 0;
                }

            }
        }*/
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }


        //展示还原的二维数组
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
