package org.Pattern.factory.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 咖啡店
 */
public class CoffeeStore {
    public  Coffee orderCoffee(String type){
    //声明coffee类型的变量，根据不同类型创建不同的coffee子类对象
    Coffee coffee=null;
    if ("美式咖啡".equals(type)){
        coffee=new AmericanCoffee();
    } else if ("拿铁咖啡".equals(type)) {
        coffee=new LatteCoffee();
    } else {
        throw  new RuntimeException("错误");
    }
    //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
