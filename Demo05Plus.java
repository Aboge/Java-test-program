/*
四则运算当中的加号“+”常见的三种用法

1.对于数值来说，那就是加法运算
2.对于字符char类型来说，在计算之前char会被提升为int类型。，然后在计算。
char类型字符，和int类型数字，之间的对照关系表：ASCII
3.对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串的连接操作。
任何数据在与字符串类型和字符串进行连接的时候，结果都会变成字符串。
*/
public class Demo05Plus{
	public static void main(String[] args) {
		System.out.println(20+30);//50

		String str = "Hello";
		System.out.println(str + 30);//Hello30

		String str2 = "Java";
		// String + int + int 
		// String       + int
		// String
		String.out.println(str2 + 20 + 30);//str2030
		//小括号提升运算优先级 
		System.out.println(str2 + (20 + 30));//str50

	}
}