package org.Pattern.strategy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/18
 * @description 具体策略类，封装算法
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买1送1");
    }
}
