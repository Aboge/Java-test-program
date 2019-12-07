/*
强制数据类型转换
	1。特点：代码需要进行特殊的格式处理，不能自动完成
	2.格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；

注意事项：
	1.强制类型转换一般不推荐使用，因为有可能发生精度损失，数据溢出。
	2.byte/short/char折三种类型都会发生数学运算，例如“+”。
	3.byte/short/char折三种类型在进行运算的时候，都会被首先升为int1类型，然后再计算。
	4.boolean类型不能发生数据类型转换
*/
public class Demo02DataType{
	public static void main(String[] args) {
		// 左边是int类型，右边是long类型，不一样。
		// long --> int，不是从小到大
		// 不能发生自动类型转换
		// 格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；
		int num = (int)100L;
		System.out.println(num);


		//long强制转换成为int类型(int最多只能装8位数据)
		int num2 = (int)6000000000L;
		System.out.println(num2);

		//double --> int,强制类型转换
		int num3 = (int)3.5;
		System.out.println(num3);//转换后会舍弃掉所有的小数位

		char zifu1 = 'A'; //这是一个字符类型的变量，里面是大写字母A
		System.out.println(zifu1 + 1);//在计算时，会将‘A’转换为对应的数字后在进行运算处理

		byte num4 = 40;
		byte num5 = 60;
		// byte +byte --> int + int -->int 
		// 注意！右侧的数值大小不能超过左侧的类型范围
		int reasult1 = num4 +num5;
		System.out.println(reasult1);

		short num6 = 60;
		//byte +short --> int + int -->int 
		//int强制转换为short：注意必须要保证逻辑上真实大小本来就没有超过short范围，否则会发生数据溢出
		short reasult2 = (short)(num4 + num6);
		System.out.println(reasult2);
	}
}