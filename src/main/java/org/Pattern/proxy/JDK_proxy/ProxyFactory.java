package org.Pattern.proxy.JDK_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 获取代理对象的工厂类
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station=new TrainStation();
    /**
     * 返回代理对象
     * ClassLoader loader:类加载器，用于加载代理，可以通过目标对象获取类加载器
     * Class<?>[] interfaces：代理类实现的接口的字节码对象
     * InvocationHandler h：代理对象的调用处理程序
     *
     * */
    public SellTickets getProxyObject() {
        //返回代理对象
        SellTickets proxyObject=(SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy和proxyObject是同一个对象：代理对象。在inkvoe方法中，基本不用
                     * Method method：对接口中的方法进行封装的method对象
                     * Object[] args：调用方法的实际参数
                     * 返回值：方法的返回值
                     * */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取费用（JDK动态代理）");
                        //执行目标对象的方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
