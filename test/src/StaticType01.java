public class StaticType01 {

    //1.匿名代码块
    {
        System.out.println("这是匿名方法！");
    }

    //2.静态方法
    static {
        System.out.println("这是静态方法！");
    }

    //3.构造方法

    public StaticType01() {
        System.out.println("这是构造方法！");
    }

    public static void main(String[] args) {
        StaticType01 s = new StaticType01();
        System.out.println("-------------");
        StaticType01 s1 = new StaticType01();
    }
}
