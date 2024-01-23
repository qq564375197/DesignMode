package org.Pattern.Singleton.demo3;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/31
 * @description 懒汉式-方式1-线程不安全
 */
public class Singleton {
    //1.私有的构造方法
    private Singleton(){
    }
    //声明Singleton类型的变量instance
    private  static Singleton instance;//只是声明一个该类型的变量，并没有进行赋值
    //对外提供一个访问方式
    public  static  synchronized Singleton getInstance(){
        //判断instance是否为null，如果为Null,说明还没有创建单例对象。
        //如果没有，创建并返回，如果有，直接返回。
        //---此方法会导致线程不安全。 若同时调用getInstance方法。
        if (instance==null){
            //线程1等待，线程2获取到CPU执行权，也会进入到该判断！里面！！
            //此处会导致创建成多个！
            instance=new Singleton();
        }
        return instance;
    }
}
