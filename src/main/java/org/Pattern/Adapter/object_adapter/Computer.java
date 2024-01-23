package org.Pattern.Adapter.object_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 计算机类
 */
public class Computer {
    //从SD卡中读取数据
    public String  readSD(SDCard sdCard){
        if (sdCard==null){
             throw  new NullPointerException("SD无数据");
        }
        return  sdCard.readSD();
    }
}
