package org.Pattern.decorator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/19
 * @description 快餐店(抽象构件角色)
 */
public abstract class FastFood {
    private  float price;//价格
    private  String desc;//描述

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //有参构造
    public FastFood(float price,String desc){
        this.desc=desc;
        this.price=price;
    }
    //无参构造
    public FastFood(){

    }
    //抽象方法
    public abstract float cost();

}
