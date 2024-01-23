package org.Pattern.proxy.CGLIB_proxy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory=new ProxyFactory();
        TrainStation trainStation = factory.getproxyObject();
        //trainStation.sell();
        trainStation.getTictket();
    }
}
