package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 电梯运行状态类
 */
public class RunningState extends LiftState{
    @Override
    public void open() {
        //什么都不做
    }

    @Override
    public void close() {
        //什么都不做
    }

    @Override
    public void running() {
        System.out.println("电梯运行中-----");
    }

    @Override
    public void stop() {
        //修改参数
        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }
}
