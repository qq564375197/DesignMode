package org.Pattern.factory.factory_method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 美式咖啡工厂对象，专门用来生成美式咖啡
 */
public class AmreicanCoffeeFactory  implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return  new AmericanCoffee();
    }
}
