package org.Pattern.factory.abstract_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 请写明这个类是干嘛的
 */
public class ItalyDessertFactory  implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
