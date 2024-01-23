package org.Pattern.factory.config_factory;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/4
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.creatCoffee("american");
        System.out.println(coffee.getName());

    }
}
