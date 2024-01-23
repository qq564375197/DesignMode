package org.Customannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/15
 * @description 自定义注解-实现
 */
@Target(ElementType.FIELD) // 描述字段（bean类字段）
@Retention(RetentionPolicy.RUNTIME)//在运行时有效，可以通过注解获取
public @interface Myfield {
    String desciption();
    int length();
}
