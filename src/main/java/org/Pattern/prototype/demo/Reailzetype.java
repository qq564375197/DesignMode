package org.Pattern.prototype.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 请写明这个类是干嘛的
 */
public class Reailzetype implements Cloneable{
    @Override
    public Reailzetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Reailzetype) super.clone();
    }
}
