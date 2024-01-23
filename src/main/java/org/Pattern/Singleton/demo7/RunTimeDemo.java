package org.Pattern.Singleton.demo7;

import java.io.IOException;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 源码解析--测试
 */
public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //调用runtime对象
        //方法exec--参数-要的是一个命令
        Process ipconfig = runtime.exec("ipconfig");

        long l = runtime.freeMemory();
        System.out.println(l);
    }
}
