package org.Pattern.Observer;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 抽象主题角色类
 */
public interface Subject {
    //添加订阅者（添加观察者对象）
    void  attach(Observer observer);
    //删除订阅者
    void detach(Observer observer);
    //通知订阅者更新消息
    void notify(String message);
}
