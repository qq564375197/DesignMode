package org.example.demo1;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 搜狗输入法
 */
public class SouGoInput {
    //此处聚合
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public  void display(){
        skin.display();
    }
}
