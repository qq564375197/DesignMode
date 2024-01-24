package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 抽象状态类
 */
public abstract class LiftState {
    //声明环境角色类变量
    protected Context context;
    public void  setContext(Context context){
        this.context=context;
    }
    //电梯开启操作
    public  abstract void open();
    //电梯关闭操作
    public  abstract void close();
    //电梯运行操作
    public  abstract void running();
    //电梯停止操作
    public  abstract void stop();
}
