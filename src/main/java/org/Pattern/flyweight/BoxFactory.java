package org.Pattern.flyweight;

import java.util.HashMap;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/27
 * @description 工厂类：将该类设计为单例
 */
public class BoxFactory {
    private HashMap<String,AbstrarctBox> map;

    //在构造方法中进行初始化操作
    private BoxFactory(){
        map=new HashMap<>();
        map.put("I",new Ibox());
        map.put("L",new Lbox());
        map.put("O",new Obox());
    }
    private  static  BoxFactory boxFactory=new BoxFactory();

    //提供一个方法获取该工厂类对象
    public  static  BoxFactory getInstance(){
        return  boxFactory;
    };

    //根据名称获取图形对象
    public  AbstrarctBox getShape(String name){
        return  map.get(name);
    }
}
