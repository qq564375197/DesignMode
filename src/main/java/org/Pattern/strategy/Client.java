package org.Pattern.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/18
 * @description 客户端类
 */
public class Client {
    public static void main(String[] args) {
        //选A
        StrategyA strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        salesMan.salesManShow();
    }
}
