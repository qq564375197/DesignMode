package org.aboutMoreTrick;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 关于Hashmap的相关技巧使用
 */
public class AboutMap {
    //解析：
    //Hashmap是java中常用的实现了`map`接口的键值对集合类。本类主要实现一些技巧的方法
    public static void main(String[] args) {
        //解释map<Object,Objcet>  分别对应key类型和value类型
    }
    //map的基本方法
    void MapbaseMethod(HashMap<Integer, Integer> map){
        //添加key,value
        map.put(1,2);
        //根据键获取对应的值 map.get(key)--取到value
        Integer num = map.get(1);
        //判断hashMap中是否包含指定的key---返回值 boolean----map里面的key是唯一的。如果存放相同的key。那么会覆盖value值。
        map.containsKey(1);
        //判断hashMap中是否包含指定的value---返回值 boolean
        map.containsValue(2);
        //获取HashMap中所有键的集合---返回值set
        Set<Integer> integers = map.keySet();
        //获取HashMap中所有的值的集合
        Collection<Integer> values = map.values();
        //获取HashMap中所有的键值对（Entry）集合
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //根据key移除键值对，
        Integer remove1 = map.remove(1);
        //获取HashMap中键值对的数量。
        map.size();
    }
    //map的使用技巧
    void MapTrick(HashMap<Integer, Integer> map){

    }
}
