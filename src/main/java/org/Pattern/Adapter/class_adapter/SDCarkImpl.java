package org.Pattern.Adapter.class_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class SDCarkImpl implements SDCard{
    @Override
    public String readSD() {
        String msg="SD卡数据-hello";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println(msg);
    }
}
