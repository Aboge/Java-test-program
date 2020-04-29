public class StaticType {

    private static int age; //静态变量
    private String sex;     //非静态变量

    public static void A(){

    }

    public void B(){

    }

    public static void main(String[] args) {
        StaticType s = new StaticType();

        //通过实例对象访问其变量
        String sex = s.sex;
        int age = s.age;

        //通过类直接访问静态变量
        int age1 = StaticType.age;
        //StaticType.sex; //类不能直接访问非静态变量



        //静态方法.可以直接调用
        A();
        StaticType.A();
        //StaticType.B();
        s.B();//可以通过实例对象进行访问
    }
}
