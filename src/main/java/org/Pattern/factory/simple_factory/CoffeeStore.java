package org.Pattern.factory.simple_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 咖啡店
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
      SimpleCoffeeFactory factory=new SimpleCoffeeFactory();
      //调用生成咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        /*
        * 如果采用静态工厂模式，直接SimpleCoffeeFactory.createCoffee(type) 即可
        * */
        //加配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
