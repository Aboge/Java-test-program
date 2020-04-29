package 接口;

//接口相当于一个方法的约束，其本身并不实现方法
public interface UserService {
    //定义的属性都是常量public static final～
    public static final int age = 10;

    //接口中所有定义其实都是抽象的public abstract
    public abstract void add();
    public abstract void delete();
    public abstract void update();
    public abstract void query();
}
