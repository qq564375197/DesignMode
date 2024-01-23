package org.Pattern.factory.factory_method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 工厂方法接口 抽象工厂
 */
public interface CoffeeFactory {
    //创建咖啡对象的方法
    Coffee createCoffee();
}
