package org.Pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 描述该类功能
 */
public class StudentAggregateImpl implements  StudentAggregate{
    private List<Student> list=new ArrayList<>();
    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }
    @Override
    public void deleteStudent(Student stu) {
        list.remove(stu);
    }
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }

}
