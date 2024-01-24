package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 请写明这个类是干嘛的
 */
public class StopState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {

    }

    @Override
    public void running() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了----");
    }
}
