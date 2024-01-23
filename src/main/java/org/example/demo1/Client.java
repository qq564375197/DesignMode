package org.example.demo1;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 测试类
 */
public class Client {
    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SouGoInput souGoInput=new SouGoInput();
        //2.创建皮肤对象
        DefaultSkin skin=new DefaultSkin();
        //3.将皮肤设置到输入法中
        souGoInput.setSkin(skin);
        //4.显示皮肤
        souGoInput.display();
    }
}
