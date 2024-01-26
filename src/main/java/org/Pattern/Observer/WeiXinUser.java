package org.Pattern.Observer;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 具体观察者角色
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }
}
