package org.Pattern.factory.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 测试类
 */
public class Client {
    public static void main(String[] args) {
        //1.创建咖啡店类对象
        CoffeeStore coffeeStore=new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("美式咖啡");
        System.out.println(coffee.getName());
    }
}
