package 继承;

public class Application {
    public static void main(String[] args) {

        //一个对象的实际类型是确定的
//        new Father();
//        new Son();

        //可以指向的引用类型是不确定了：父类的引用指向子类
        //对象能执行哪些方法，主要看对象左侧的类型，和右边的关系不大！

        Father father = new Father();
        father.mathod();       //父类型的对象，直接使用的父类型的方法
        Father f1 = new Son();   //多态
        f1.mathod();    //Father 父类型 可以直接访问子类重写的新的方法
        // f1.privateMethod();    //father 父类型 不能直接访问子类的私有方法（非继承方法）
        ((Son) f1).privateMethod(); //只能将其强制转换为Son类型的对象。才能访问私有方法

        //Son 子类行 能调用自己的方法和继承于父类的方法，以及重写的父类的方法(实际已经属于子类的方法)
        Son son = new Son();
        son.mathod();
        son.privateMethod();

    }
}
