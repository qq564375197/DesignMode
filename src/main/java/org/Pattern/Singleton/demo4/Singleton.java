package org.Pattern.Singleton.demo4;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/31
 * @description 懒汉式-方式3-双重检查所方式
 */
public class Singleton {
    //私有方法
    private  Singleton(){}
    //声明Singleton类型变量
    private   static volatile   Singleton instance;
    //对外提供公共访问方法
    public  static    Singleton getInstance(){
        //第一次判断！如果instance的值不为Null，不需要抢占锁，直接返回对象
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
