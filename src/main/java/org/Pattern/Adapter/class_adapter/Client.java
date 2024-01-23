package org.Pattern.Adapter.class_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer=new Computer();
        String s = computer.readSD(new SDCarkImpl());
        System.out.println(s);
        System.out.println("===========");
        //使用电脑读取TF卡中的数据
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
