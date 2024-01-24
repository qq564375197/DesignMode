package org.Pattern.responsibility;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/24
 * @description 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest san = new LeaveRequest("张三", 1, "生病");
        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //设置处理者责任链
        manager.setNextHandler(generalManager);
        groupLeader.setNextHandler(manager);
        //提交请假条
        groupLeader.submit(san);
    }
}
