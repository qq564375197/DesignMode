package org.example.demo5;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/27
 * @description 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent=new Agent();
        Star star=new Star("刘德华");
        Fans fans=new Fans("廖家银");
        Company company=new Company("明星传媒");
        agent.setFans(fans);
        agent.setStar(star);
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }
}
