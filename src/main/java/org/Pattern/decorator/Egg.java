package org.Pattern.decorator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 鸡蛋类（具体的装饰者角色）
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(1,"鸡蛋",fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice()+getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
