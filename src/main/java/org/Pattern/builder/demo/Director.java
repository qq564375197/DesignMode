package org.Pattern.builder.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 指挥者
 */
public class Director {
    //声明builder类型的变量
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    //组装自行车的功能
    public Bike construct(){
        builder.buildSeat();
        builder.buildeFrame();
        return builder.createBike();
    }
}
