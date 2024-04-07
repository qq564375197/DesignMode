package org.thread.createThread;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/6
 * @description 测试客户端-多线程：继承Thread类，实现多线程
 */
public class Client {
    public static void main(String[] args) {
        //manyThreadTwo();
        //manythree();
    }
    /**
     * 创建多线程1：继承Thread类实现多线程调用
     * */
    private static void manyThreadOne(){
        Demo de = new Demo();
        Demo dem = new Demo();
        Demo demo = new Demo();
        de.start();
        dem.start();
        demo.start();
    }
    /**
     * 创建多线程2：实现Runnable接口
     * */
    private static void manyThreadTwo(){
        Demo2 de = new Demo2();
        Demo2 dem = new Demo2();
        Demo2 demo = new Demo2();
        Thread thread1 = new Thread(de);
        Thread thread2 = new Thread(dem);
        Thread thread3 = new Thread(demo);
        thread1.start();
        thread2.start();
        thread3.start();
    }
    /**
     * 创建多线程3：实现CallAble<T>接口
     * */
    private static void manythree(){
        //创建三个线程
        Demo3 demo = new Demo3();
        Demo3 demo2 = new Demo3();
        Demo3 demo3 = new Demo3();
        //创建三个个FutureTask对象，用Callable对象作为构造方法的参数
        FutureTask<String> ft = new FutureTask<>(demo);
        FutureTask<String> ft2 = new FutureTask<>(demo2);
        FutureTask<String> ft3 = new FutureTask<>(demo3);
        //创建一个Thread对象，用FutureTask对象作为构造方法的参数
        Thread thread = new Thread(ft);
        Thread thread2 = new Thread(ft2);
        Thread thread3 = new Thread(ft3);
        //启动三个线程
        thread.start();
        thread2.start();
        thread3.start();
    }
    /**
     *  创建多线程4：实现线程池类
     * */
    private static void manyfour(){
        Demo2 demo2=new Demo2();
        Demo4 demo4 = new Demo4();
        //线程池开启
        demo4.executor.execute(demo2);
        //线程池关闭
        demo4.executor.shutdown();
    }

}
