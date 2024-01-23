package org.Pattern.factory.config_factory;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 咖啡类
 */
public abstract class Coffee {
    public  abstract  String  getName();

    //加糖
    public  void  addSugar(){
        System.out.println("加糖");
    }
    //加奶
    public void  addMilk(){
        System.out.println("加奶");
    }
}
