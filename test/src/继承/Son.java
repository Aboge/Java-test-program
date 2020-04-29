package 继承;

public class Son extends Father {

    @Override
    public void mathod() {
        System.out.println("这是子类重写的方法！");
    }

    public void privateMethod(){
        System.out.println("这是子类私有的方法！");
    }
}
