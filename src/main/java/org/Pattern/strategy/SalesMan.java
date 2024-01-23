package org.Pattern.strategy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/18
 * @description 环境类
 */
public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;
    //有参构造方法
    public SalesMan(Strategy strategy){
        this.strategy=strategy;
    }

    //由促销员展示促销活动给用户
    public void salesManShow(){
        strategy.show();
    }
}
