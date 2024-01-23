package org.Pattern.proxy.static_proxy;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/18
 * @description 请写明这个类是干嘛的
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站没票");
    }
}
