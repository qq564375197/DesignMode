package org.Pattern.Adapter.class_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 适配者类的接口
 */
public interface TFcard {
    //从TF卡中读取数据
    String readTF();
    //从TF卡中写数据
    void  writeTF(String msg);
}
