package org.Pattern.template;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/10/18
 * @description 炒包菜类 具体的子类
 */
public class ConcreteClass_BaoCai extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {

        System.out.println("下锅的酱料是辣椒");
    }
}
