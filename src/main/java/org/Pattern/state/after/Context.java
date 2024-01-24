package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 环境角色类
 */
public class Context {
    //定义对应状态对象的常量
    public final  static OpeningState OPENING_STATE=new OpeningState();
    public final  static RunningState RUNNING_STATE=new RunningState();
    public final  static ClosingState CLOSING_STATE=new ClosingState();
    public final  static StopState STOP_STATE=new StopState();
    //当前状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }
    //设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前状态对象中的context对象
        this.liftState.setContext(this);
    }
    //电梯开门
    public void open(){
        this.liftState.open();
    }
    //电梯关门
    public void close(){
        this.liftState.close();
    }
    //电梯运行
    public void running(){
        this.liftState.running();
    }
    //电梯停止
    public void stop(){
        this.liftState.stop();
    }
}
