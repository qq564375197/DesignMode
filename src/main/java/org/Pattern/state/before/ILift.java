package org.Pattern.state.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 电梯接口
 */
public interface ILift {
    //定义4个电梯状态的常量
    int OPENING_STATE=1;
    int CLOSING_STATE=2;
    int RUNNING_STATE=3;
    int STOPPING_STATE=4;
    //设置电梯状态的功能
    void setState(int state);
    //电梯操作的功能
    void open();
    void close();
    void running();
    void stop();
}
