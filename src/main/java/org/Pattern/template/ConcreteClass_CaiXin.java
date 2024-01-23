package org.Pattern.template;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/10/18
 * @description 炒菜心类 具体的子类
 */
public class ConcreteClass_CaiXin extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是番茄");
    }
}
