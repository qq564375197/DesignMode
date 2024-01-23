package org.Pattern.builder.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 抽象建造者类
 */
public abstract class Builder {
    //声明Bike类型的变量，并进行赋值
    protected  Bike bike =new Bike();

    public abstract  void  buildeFrame();
    public abstract void  buildSeat();
    //构建自行车的方法
    public  abstract Bike createBike();

}
