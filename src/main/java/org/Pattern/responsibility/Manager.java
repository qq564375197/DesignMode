package org.Pattern.responsibility;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/24
 * @description 小组长类（具体的处理者）
 */
public class Manager extends Handler{
    public Manager(){
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }
    @Override
    protected void handlerleave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getDay()+"天"+"因："+leave.getContent());
        System.out.println("部门经理同意审批意见");
    }
}
