package Exception;

public class Test {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        new Test().test(a,b);

        //假设要捕获多个异常，从小到大设置catch
        //快捷键：选中要捕获异常的字段option + command + T

        try {                           //try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){ //catch（想要捕获的异常类型） 捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }catch (Exception e){             //Exception 更大范围的异常捕获
            System.out.println("出现Exception类型的异常！");
        }
        finally {                      //处理善后工作，无论如何都会执行
            System.out.println("程序结束！");
        }

    }

    //假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a,int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException(); //主动抛出异常！一般在方法中使用
        }
        System.out.println(a/b);

    }
}

