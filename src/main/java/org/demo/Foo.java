package org.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 一个类的执行顺序。
 */
public class Foo {
    //私有变量
    private int x;
    //代码块
    {
        System.out.println("1");
    }
    //静态代码块
    static {
        System.out.println("2");
    }
    //构造器
    public Foo() {
        System.out.println("3");
        System.out.println("x=" + x + ",z=" + z);
    }
    //重写构造器
    public Foo(int x) {
        super();
        System.out.println("4");
        this.x = x;
    }
    //静态常量
    static int z = 8;
    //普通方法
    public void say() {
        System.out.println("5");
    }
    //静态方法
    public static void say2() {
        {
            System.out.println("6");
        }
        System.out.println("7");
    }
}
