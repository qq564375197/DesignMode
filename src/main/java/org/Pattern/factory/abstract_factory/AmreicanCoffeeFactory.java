package org.Pattern.factory.abstract_factory;

import org.Pattern.factory.factory_method.CoffeeFactory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 美式风味的甜品工厂--生产美式咖啡和抹茶慕斯
 */
public class AmreicanCoffeeFactory implements DessertFactory{


    @Override
    public Coffee createCoffee() {
       return  new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
