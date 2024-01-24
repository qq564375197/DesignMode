package org.Pattern.state.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/25
 * @description 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        //创建环境对象
        Context context=new Context();
        //设置当前电梯状态
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.running();
        context.stop();
    }
}
