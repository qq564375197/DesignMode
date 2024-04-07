package org.thread.createThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/6
 * @description 创建多线程方法4：实现线程池类
 */
public class Demo4 {
    static final int CORE_POOL_SIZE = 5;    //核心线程数
    static final int MAX_POOL_SIZE = 10;     //最大线程数
    static final int QUEUE_CAPACITY = 100;  //队列容量
    static final long KEEP_ALIVE_TIME = 1L; //存活时间

    static ThreadPoolExecutor executor = null;  //静态指针
    static {
        //初始化线程池对象
        executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        for (int i = 0; i < 10; i++) {
            //线程池开启
            executor.execute(demo2);
        }
        //线程池关闭
        executor.shutdown();
    }
}
