package org.Pattern.factory.simple_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 测试-简单工厂下的咖啡类
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        Coffee coffee = store.orderCoffee("美式咖啡");
        System.out.println(coffee.getName());
    }
}
