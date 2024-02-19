package org.Pattern.mediator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 具体中介者类
 */
public class MediatorStructure extends Mediator{
    //聚合房主和租房者对象
    private  HouseOwner houseOwner;
    private Tenant tenant;
    @Override
    public void constact(String msg, Person person) {
        //判断传入的Person和谁相等，那就把消息传递给谁
    if (person== houseOwner) {
        tenant.getMessage(msg);
    } else {
        houseOwner.getMessage(msg);
    }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
