package org.Pattern.combination;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 菜单项：属于叶子节点
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name,int level){
        this.name=name;
        this.level=level;
    }
    @Override
    public void print() {
        for (int i=0;i<level;i++){
            System.out.print("--------");
        }
        //打印菜单项
        System.out.println(name);
    }
}
