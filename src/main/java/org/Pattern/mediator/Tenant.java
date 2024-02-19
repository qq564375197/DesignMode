package org.Pattern.mediator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 具体的同事角色类
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    //和中介联系（沟通）
    public void  constact(String msg){
        mediator.constact(msg,this);
    }
    //获取信息的方法
    public void  getMessage(String msg){
        System.out.println("租房者"+name+"获取到的信息是:"+msg);
    }
}
