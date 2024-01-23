package org.Pattern.decorator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 炒面（具体的构建角色）
 */
public class FriedNoodles extends FastFood{
    public  FriedNoodles(){
        super(15,"炒面");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
