package org.Pattern.prototype.test;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description 测试类
 */
public class CitaionTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation=new Citation();
        //2.创建张三学生对象
        Student student=new Student();
        student.setName("张三");
        citation.setSdu(student);
        //2.克隆奖状对象
        citation.setSex("男性");
        Citation clone=citation.clone();
        clone.getSdu().setName("里斯");
        clone.setSex("女性");
        //3.调用show方法展示
        citation.show();
        clone.show();

    }
}
