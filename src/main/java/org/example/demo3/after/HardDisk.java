package org.example.demo3.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 硬盘接口
 */
public interface HardDisk {
    //存储数据
    public  void  save(String data);
    //获取数据的方法
    public  String get();
}
