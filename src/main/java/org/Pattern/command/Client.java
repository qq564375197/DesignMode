package org.Pattern.command;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/19
 * @description 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1=new Order();
        order1.setDiningTable(1);
        order1.setFood("清远鸡",1);
        order1.setFood("啤酒",2);
        //创建第二个订单对象
        Order order2=new Order();
        order2.setDiningTable(2);
        order2.setFood("炸鸡",1);
        order2.setFood("可乐",2);
        //创建第三个订单对象
        Order order3=new Order();
        order3.setDiningTable(3);
        order3.setFood("鸡翅",3);
        //创建厨师对象
        SeniorChef reciver=new SeniorChef();
        //创建命令对象
        OrderCommand orderCommand1=new OrderCommand(reciver,order1);
        OrderCommand orderCommand2=new OrderCommand(reciver,order2);
        OrderCommand orderCommand3=new OrderCommand(reciver,order3);
        //创建调用者（服务员对象）
        Waitor invoke=new Waitor();
        invoke.setCommand(orderCommand1);
        invoke.setCommand(orderCommand2);
        invoke.setCommand(orderCommand3);
        //服务员发起命令
        invoke.Orderup();
    }
}
