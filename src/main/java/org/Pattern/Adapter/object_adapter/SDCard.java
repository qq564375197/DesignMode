package org.Pattern.Adapter.object_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public interface SDCard {
    //从SD卡读取数据
    String readSD();
    //往SD卡写数据
    void writeSD(String msg);
}
