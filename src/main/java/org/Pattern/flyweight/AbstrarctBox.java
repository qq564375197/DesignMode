package org.Pattern.flyweight;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 抽象享元角色
 */
public abstract class AbstrarctBox {
    //获取图形的方法
    public  abstract  String getShape();
    //显示图形及颜色
    public  void  display(String color){
        System.out.println("方块形状:"+getShape()+",方块的颜色"+color);


    }
}
