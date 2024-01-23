package org.Pattern.builder.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description ofo单车构建者，用来构建ofo单车
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildeFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
       bike.setSeat("思维车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
