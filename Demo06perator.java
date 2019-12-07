/*
自增运算符：++
自减运算符：--

基本含义：让一个变量涨一个数字1，或者让一个变量降一个运算符
使用格式：写在变量名称之前或者写在变量名称后，或者与打印操作混合使用

使用方式：
1.在单独使用的时候，在变量前后都一样，也就是++（--）num；和num++（--）完全一样。
2.在混合使用的时候，有【重大区别】
	A.如果是【前++】，那么变量先进行++操作，在拿结果进行使用
	B.如果是【后++】，那么首先使用变量当前的数值，在进行变量+1.
注意事项：
	只有变量才可以进行自增和自减的运算。
*/
public class Demo06perator{
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		++num1;//单独前使用
		System.out.println(num1);
		num1++;//单独后使用
		System.out.println(num1);

		System.out.println("============");


		//与答应操作混合使用
		int num2 = 20;
		// 混合使用，先++，变量立刻马上变成21，然后在打印输出21
		System.out.println(++num2);
		System.out.println(num2);//21
		System.out.println("============");
		//后++，先使用当前的数值，然后在进行++操作
		int num3 = 30;
		System.out.println(num3++);//30
		System.out.println(num3);//31
	}
}