package org.example.demo3.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 希捷硬盘
 */
public class XIJieHardDisk implements HardDisk {
    //存储数据的方法
    public  void  save(String data){
        System.out.println("存储数据"+data);
    }


    public String get() {
        return "数据+华";
    }


}
