package org.Pattern.facade;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 外观类，用户主要操作该类对象进行交互
 */
public class SmartApplicaitiionFacade {
    //聚合电灯对象，电视对象，空调对象
    private  Light light;
    private  TV tv;
    private  AirCondition airCondition;

    public SmartApplicaitiionFacade() {
        light=new Light();
        tv=new TV();
        airCondition= new AirCondition();
    }
    //通过语言控制
    public  void  say(String message){
        if (message.equals("开")){
                on();
        } else if (message.equals("关")) {
            off();
        } else {
            System.out.println("我还听不懂");
        }
    }
    //已经打开
    private  void  on(){
       light.on();
       tv.on();
       airCondition.on();
    }
    //一键关闭
    private  void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
