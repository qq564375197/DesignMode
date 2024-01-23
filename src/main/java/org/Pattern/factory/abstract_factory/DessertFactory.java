package org.Pattern.factory.abstract_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 生产工厂
 */
public interface DessertFactory {
    //生产咖啡的功能
    Coffee  createCoffee();
    //生产甜品的功能
    Dessert createDessert();
}
