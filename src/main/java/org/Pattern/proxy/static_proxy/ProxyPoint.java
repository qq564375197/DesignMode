package org.Pattern.proxy.static_proxy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 代售点
 */
public class ProxyPoint implements SellTickets{
    //声明火车站类对象
    private TrainStation trainStation=new TrainStation();
    @Override
    public void sell() {
        System.out.println("收取费用");
            trainStation.sell();
    }
}
