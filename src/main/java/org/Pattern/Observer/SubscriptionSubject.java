package org.Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 具体主题角色类
 */
public class SubscriptionSubject implements  Subject{
    //定义一个集合，用来存储多个观察者对象
    private List<Observer> weixinUserList=new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //遍历集合
        for (int i=0;i< weixinUserList.size();i++){
            //调用观察者对象中的update方法
            weixinUserList.get(i).update(message);
        }
    }
}
