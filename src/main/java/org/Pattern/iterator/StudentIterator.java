package org.Pattern.iterator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 抽象迭代器角色接口
 */
public interface StudentIterator {
    //判断是否还有元素
    boolean hashNext();
    //获取下一个元素
    Student next();
}
