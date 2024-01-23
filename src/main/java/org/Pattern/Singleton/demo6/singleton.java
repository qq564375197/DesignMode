package org.Pattern.Singleton.demo6;

import java.io.Serializable;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 测试使用反射破坏单例模式
 */
public class singleton  implements Serializable {
    private  static  boolean flag=false;
    //私有构造方法
    private  singleton(){
        //加锁解决多线程问题
        synchronized (singleton.class){
            //判断flag的值是否为true，如果是true，说明非第一次访问。直接抛异常，如果是false，说明是第一次，正常创建即可
            if (flag){
                throw  new RuntimeException("不能创建多个对象");
            }
            //将flag值设置为ture
            flag=false;
        }

    }
    //定义一个静态内部类
    private  static  class  SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private  static final   singleton INSTANCE=new singleton();

    }
    //提供公共的访问方式
    public  static singleton getInstance(){
        return  SingletonHolder.INSTANCE;
    }
    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public  Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
