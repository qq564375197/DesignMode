package org.Pattern.factory.factory_method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store=new CoffeeStore();
        //创建对象
        CoffeeFactory factory=new AmreicanCoffeeFactory();
        store.setFactory(factory);
        //点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
