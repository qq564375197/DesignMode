package org.Pattern.Adapter.object_adapter;

import org.Pattern.Adapter.class_adapter.TFCardImpl;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 适配类
 */
public class SDAdapterTF  implements SDCard {
    private TFCardImpl  tfCard;

    public SDAdapterTF(TFCardImpl tfCard){
        this.tfCard=tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("适配tf卡-读");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("适配TF-写");
        tfCard.writeTF(msg);
    }
}
