public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //JDK1.5之后出现的增强for循环，适合遍历打印输出，没有下标，不适合具体操作数组元素
        for (int array : arrays) {   //可以使用快捷键"iter"或者"arrays.for"
            System.out.println(array);
        }

        printArray(arrays); //调用打印方法

        System.out.println("-------------------------");

        for (int i : reverse(arrays)) {
            System.out.println(i);
        }


    }

    //打印数组元素的方法,普通for循环可以操作每个元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){   //返回值类型为数组

        /*int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0; i < arrays.length; i++) {
            result[i] = arrays[arrays.length-i-1];   //直接将一个数组的数据遍历后存入另外一个数组
        }
        return result;*/

        //在一个数组内部实现元素调换(最小资源消耗)
        int temp = 0;
        for (int i = 0,j = arrays.length; i < j/2; i++) {
            temp = arrays[i];
            arrays[i] = arrays[j-1-i];
            arrays[j-1-i] = temp;
        }

        return arrays;
    }
}
