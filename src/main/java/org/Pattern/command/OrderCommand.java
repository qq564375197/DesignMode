package org.Pattern.command;

import java.util.Map;
import java.util.Set;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/19
 * @description 具体的命令类
 */
public class OrderCommand implements Command{
    //持有接收者对象
    private SeniorChef reciver;
    //持有订单对象
    private Order order;
    public OrderCommand(SeniorChef reciver,Order order){
      this.reciver=reciver;
      this.order=order;
    }
    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        Set<String> keySet = foodDir.keySet();
        for (String foodName:keySet){
            reciver.makeFood(foodName,foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable()+"桌的饭准本完毕");
    }
}
