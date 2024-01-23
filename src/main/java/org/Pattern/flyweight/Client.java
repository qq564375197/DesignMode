package org.Pattern.flyweight;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstrarctBox i = BoxFactory.getInstance().getShape("I");
        i.display("黑色");
        //获取L图形
        AbstrarctBox L = BoxFactory.getInstance().getShape("L");
        L.display("绿色");
        //获取O图形
        AbstrarctBox O = BoxFactory.getInstance().getShape("O");
        O.display("绿色");
        //获取O图形
        AbstrarctBox O2 = BoxFactory.getInstance().getShape("O");
        O2.display("红色");
        System.out.println("两次获取到的O图形对象是否一致"+(O==O2));
    }
}
