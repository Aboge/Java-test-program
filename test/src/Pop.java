import java.lang.reflect.Array;
import java.util.Arrays;

public class Pop {
    /*
    * * 冒泡排序：
1. 比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置
2. 每一次比较，都会产生出一个最大，或者最小的数字。
3. 下一轮则可以少一次排序！
4. 依次循环，直到没有元素需要交换。

    * */
    public static void main(String[] args) {
        int[] arrays = {4,2,3,8,6};
        sort(arrays);
    }

    public static void sort(int[] arrays){

        int temp = 0;

        //外层循环,判断我们这个要走多少次
        for (int i = 0; i < arrays.length-1; i++) {

            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            if (arrays[i] > arrays[i+1]){
                temp = arrays[i+1];
                arrays[i+1] = arrays[i];
                arrays[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arrays));
    }
}
