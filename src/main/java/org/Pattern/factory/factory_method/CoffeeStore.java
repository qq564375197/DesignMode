package org.Pattern.factory.factory_method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 咖啡店
 */
public class CoffeeStore {
    private CoffeeFactory factory;
    public  void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }
    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return  coffee;
    }
}
