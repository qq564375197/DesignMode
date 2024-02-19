package org.Pattern.mediator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 测试客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator=new MediatorStructure();
        //创建租房者对象
        Tenant tenant=new Tenant("黎4",mediator);
        //创建房主对象
        HouseOwner houseOwner=new HouseOwner("张三",mediator);
        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constact("我要租三室一厅的房子");
        houseOwner.constact("我这里有，价格700");
        tenant.constact("租，押一付三？什么付款方式？");
    }
}
