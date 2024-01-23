package org.Pattern.factory.config_factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/7
 * @description JDK源码解析iterator方法
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("黄宇轩");
        list.add("湖广省");
        list.add("林北");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String ele=iterator.next();
            System.out.println(ele);
        }
    }
}
