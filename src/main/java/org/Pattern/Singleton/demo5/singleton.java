package org.Pattern.Singleton.demo5;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 静态内部类方式
 */
public class singleton {
    //私有构造方法
    private  singleton(){

    }
    //定义一个静态内部类
    private  static  class  SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private  static final singleton  INSTANCE=new singleton();
    }
    //提供公共的访问方式
    public  static  singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
