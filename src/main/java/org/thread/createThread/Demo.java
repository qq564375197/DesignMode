package org.thread.createThread;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/6
 * @description 创建多线程方法1：继承Thread类重写run方法
 */
public class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }
}
