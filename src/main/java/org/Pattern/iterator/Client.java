package org.Pattern.iterator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 测试
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl aggregate=new StudentAggregateImpl();
        aggregate.addStudent(new Student("张三","001"));
        aggregate.addStudent(new Student("张1","002"));
        aggregate.addStudent(new Student("张2","003"));
        aggregate.addStudent(new Student("张4","004"));
        aggregate.addStudent(new Student("张5","005"));
        //遍历聚合对象
        //1.获取迭代器对象
        StudentIterator iterator = aggregate.getStudentIterator();
        //2.遍历
        while (iterator.hashNext()){
            //3.获取元素
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }
}
