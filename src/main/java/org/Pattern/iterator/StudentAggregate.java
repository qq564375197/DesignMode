package org.Pattern.iterator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 抽象聚合角色接口
 */
public interface StudentAggregate {
    //添加学生功能
    void addStudent(Student stu);
    //删除学生功能
    void deleteStudent(Student stu);
    //获取迭代器对象功能
    StudentIterator getStudentIterator();

}
