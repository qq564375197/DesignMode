package org.Pattern.decorator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food=new FriedRice();
        System.out.println(food.getDesc()+ food.cost());
        System.out.println("------------");
        //加鸡蛋
        food= new Egg(food);
        System.out.println(food.getDesc()+food.cost());
    }
}
