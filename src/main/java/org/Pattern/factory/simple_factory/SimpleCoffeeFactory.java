package org.Pattern.factory.simple_factory;



/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 简单咖啡简单工厂类，用来生产咖啡
 */
public class SimpleCoffeeFactory {
    //public static Coffee createCoffee(String type) 增加static即可变为静态工厂
    public   Coffee createCoffee(String type){
        //声明coffee类型的变量，根据不同类型创建不同的coffee子类对象
        org.Pattern.factory.simple_factory.Coffee coffee=null;
        if ("美式咖啡".equals(type)){
            coffee=new AmericanCoffee();
        } else if ("拿铁咖啡".equals(type)) {
            coffee=new LatteCoffee();
        } else {
            throw  new RuntimeException("错误");
        }
        return  coffee;
    }
}
