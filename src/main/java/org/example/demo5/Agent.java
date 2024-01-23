package org.example.demo5;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 经纪人类
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    //和粉丝见面的方法
    public  void  meeting(){
        System.out.println(fans.getName()+"与明星"+star.getName()+"见面了");
    }
    public  void business(){
        System.out.println(company.getName()+"与明星"+star.getName()+"洽谈");
    }
}
