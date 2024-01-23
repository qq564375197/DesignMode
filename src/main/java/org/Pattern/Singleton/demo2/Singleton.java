package org.Pattern.Singleton.demo2;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/31
 * @description 单例模式--饿汉式：静态代码块
 */
public class Singleton {
    //1.私有构造方法
    private Singleton() {
    }
    //2.声明Singleton类型的变量
    private static   Singleton instance;//null
    //在静态代码块中进行赋值
    static {
        instance=new Singleton();
    }
    //对外提供一个访问方式
    public  static  Singleton getInstance(){
        return instance;
    }

}
