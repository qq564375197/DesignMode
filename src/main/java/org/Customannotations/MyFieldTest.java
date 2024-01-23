package org.Customannotations;

import java.lang.reflect.Field;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/15
 * @description 自定义注解使用
 */
public class MyFieldTest {
    //使用我们的自定义注解
    @Myfield(desciption = "用户名",length = 12)
    private String username;

    public static void main(String[] args) {
        Class c= MyFieldTest.class;
        for (Field f:c.getDeclaredFields()){
            //判断这个字段是否有MyField注解
            if (f.isAnnotationPresent(Myfield.class)){
                Myfield annotation = f.getAnnotation(Myfield.class);
                System.out.println("字段-"+f.getName()+"-描述-"+annotation.desciption()+"-长度"+annotation.length());
            }
        }

    }
}
