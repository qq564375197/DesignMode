package org.Pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 菜单类：属于树枝节点
 */
public class Menu extends MenuComponent {
    //菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> list=new ArrayList<>();
    //构造方法
    public Menu(String name,int level){
        this.level=level;
        this.name=name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
                list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
                list.remove(menuComponent);
    }

    @Override
    public MenuComponent getchild(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        for (int i=0;i<level;i++){
            System.out.print("--------");
        }
        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : list) {
            menuComponent.print();
        }
    }
}
