package org.sync;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/15
 * @description synchronized关键字实现案例
 */
class demo {
    private int count = 0;

    // 使用Synchronized关键字确保线程安全
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private demo counter;

    public CounterThread(demo counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        demo counter = new demo();

        // 创建两个线程，共同操作Counter对象
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);

        // 启动两个线程
        thread1.start();
        thread2.start();

        // 等待两个线程执行完毕
        thread1.join();
        thread2.join();

        // 输出最终的计数值
        System.out.println("Final Count: " + counter.getCount());
    }
}

