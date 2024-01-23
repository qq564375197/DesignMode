package org.Pattern.combination;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //创建菜单树
        MenuComponent menuComponent1=new Menu("菜单管理",2);
        menuComponent1.add(new MenuItem("页面访问",3));
        menuComponent1.add(new MenuItem("展开菜单",3));
        menuComponent1.add(new MenuItem("编辑菜单",3));
        menuComponent1.add(new MenuItem("删除菜单",3));
        menuComponent1.add(new MenuItem("新增菜单",3));
        MenuComponent menuComponent2=new Menu("权限管理",2);
        menuComponent2.add(new MenuItem("页面访问",3));
        menuComponent2.add(new MenuItem("提交保存",3));
        MenuComponent menuComponent3=new Menu("角色管理",2);
        menuComponent3.add(new MenuItem("页面访问",3));
        menuComponent3.add(new MenuItem("新增角色",3));
        menuComponent3.add(new MenuItem("修改角色",3));
        //创建一级菜单
        MenuComponent component=new Menu("系统管理",1);
        //将二级菜单添加到一级菜单中
        component.add(menuComponent1);
        component.add(menuComponent2);
        component.add(menuComponent3);

        //打印菜单名称
        component.print();


    }
}
