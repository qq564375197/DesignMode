package org.Pattern.Singleton.demo1;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton singleton=Singleton.getInstance();
        Singleton singleton11=Singleton.getInstance();
        System.out.println(singleton11==singleton);
    }
}
