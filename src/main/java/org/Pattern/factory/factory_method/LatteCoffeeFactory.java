package org.Pattern.factory.factory_method;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 拿铁咖啡工厂对象，专门生成拿铁咖啡对象
 */
public class LatteCoffeeFactory  implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
