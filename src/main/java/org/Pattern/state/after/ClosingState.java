package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 电梯关闭状态类
 */
public class ClosingState extends LiftState{
    @Override
    public void open() {
        //修改参数
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关闭了-------");
    }

    @Override
    public void running() {
        System.out.println("电梯运行中-------");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了-----");
    }
}
