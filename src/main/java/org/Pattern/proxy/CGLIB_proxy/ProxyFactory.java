package org.Pattern.proxy.CGLIB_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class ProxyFactory implements MethodInterceptor {
    private TrainStation station=new TrainStation();
    public  TrainStation getproxyObject(){
        //创建Enhancer对象，类似JDK代理中的Proxy类
        Enhancer  enhancer=new Enhancer();
        //设置父类的字节码对象，指定父类
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject =(TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB代理收费");
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
