package org.Pattern.strategy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/18
 * @description 具体策略类，封装算法
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("全场5折");
    }
}
