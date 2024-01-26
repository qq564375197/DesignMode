package org.Pattern.Observer;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 观察者模式-客户端测试
 */
public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅公众号
        subject.attach(new WeiXinUser("肖校"));
        subject.attach(new WeiXinUser("笑料"));
        subject.attach(new WeiXinUser("测试"));
        //公众号更新发出消息给订阅者（观察者对象）
        subject.notify("用友技术更新");
    }
}
