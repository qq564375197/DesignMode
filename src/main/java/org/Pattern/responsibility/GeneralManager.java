package org.Pattern.responsibility;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/24
 * @description 小组长类（具体的处理者）
 */
public class GeneralManager extends Handler{
    public GeneralManager(){
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }
    @Override
    protected void handlerleave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getDay()+"天"+"因："+leave.getContent());
        System.out.println("总经理同意审批意见");
    }
}
