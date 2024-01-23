package org.Pattern.Adapter.class_adapter;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 适配类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("适配tf卡-读");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("适配TF-写");
         writeTF(msg);
    }
}
