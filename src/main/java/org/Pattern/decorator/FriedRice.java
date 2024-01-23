package org.Pattern.decorator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 炒面（具体的构建角色）
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10,"炒饭");
    }


    @Override
    public float cost() {
        return getPrice();
    }
}
