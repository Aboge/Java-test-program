package Exception;

//测试自定义的异常方法
public class ExceptionTest {

    //可能存在异常的方法
    static void test(int a) throws MyException {

        System.out.println("传递的参数为：" + a);

        if (a > 10){
            throw new MyException(a);
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {

        int a = 101;

        try {
            test(a);
        } catch (MyException e) {
            System.out.println("MyException=>"+ e);
        }
    }
}
