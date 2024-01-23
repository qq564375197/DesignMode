package org.Pattern.prototype.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Reailzetype reailzetype=new Reailzetype();
        //调用reailzetype去克隆原型对象
        Reailzetype clone=reailzetype.clone();
        System.out.println("原型对象和克隆对象是否一致"+(reailzetype==clone));
    }
}
