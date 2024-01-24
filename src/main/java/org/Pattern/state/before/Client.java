package org.Pattern.state.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 测似类
 */
public class Client {
    public static void main(String[] args) {
        //创建电梯对象
        Lift lift=new Lift();
        //设置当前电梯的状态
        lift.setState(ILift.OPENING_STATE);
        //开门
        lift.open();
        lift.close();
        lift.running();
        lift.stop();
    }
}
