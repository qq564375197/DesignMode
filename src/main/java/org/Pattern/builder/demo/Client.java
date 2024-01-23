package org.Pattern.builder.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director=new Director(new MobileBuilder());
        //指挥者装配自行车
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());

    }
}
