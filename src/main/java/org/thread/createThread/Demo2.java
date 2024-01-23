package org.thread.createThread;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/6
 * @description 创建多线程方法2：实现Runnable接口重写run方法
 */
public class Demo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }
}
