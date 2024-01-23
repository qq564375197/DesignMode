package org.Pattern.builder.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 具体的构建者类，用来构建mobile单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildeFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
