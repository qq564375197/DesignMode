package org.Pattern.proxy.JDK_proxy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory proxyFactory=new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //3.调用sell方法
        proxyObject.sell();
    }
}
