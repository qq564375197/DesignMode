package org.Pattern.template;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/10/18
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        //炒包菜
        ConcreteClass_BaoCai concreteClassBaoCai = new ConcreteClass_BaoCai();
        //调用炒菜的功能
        concreteClassBaoCai.cookProcess();
    }
}
