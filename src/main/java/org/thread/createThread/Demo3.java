package org.thread.createThread;

import java.util.concurrent.Callable;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/6
 * @description 创建多线程方法3：实现Callable接口重写call方法
 */
public class Demo3 implements Callable<String>{


    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
        return "多线程创建成功";
    }
}
