public class Demo01Sequence{
	public static void main(String[] args) {
		int sum = 0;
//for循环
		// for (int i = 0; i <= 10; i++) {
		// 	if (i % 2 == 0) {
		// 		sum += i;
		// 	}
		// }
//do-while
		// int i = 0;//先进行初始化
		// do{
		// 	if (i % 2 == 0) {
		// 		sum += i;
		// 	}

		// 	i++;

		// }while(i <= 10);
//while循环
		int i = 0;
		while(i <= 10){
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("结果是："+sum);
	}
}