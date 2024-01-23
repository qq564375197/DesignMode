package org.Pattern.factory.abstract_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        //创建意大利风味工厂
      //  ItalyDessertFactory factory=new ItalyDessertFactory();
        AmreicanCoffeeFactory factory=new AmreicanCoffeeFactory();
        //获取拿铁咖啡和提拉米苏
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
