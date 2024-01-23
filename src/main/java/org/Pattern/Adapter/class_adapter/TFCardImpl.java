package org.Pattern.Adapter.class_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 适配者类
 */
public class TFCardImpl  implements TFcard{
    @Override
    public String readTF() {
        String msg="TF卡：读取数据-123";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF卡的"+msg);
    }
}
