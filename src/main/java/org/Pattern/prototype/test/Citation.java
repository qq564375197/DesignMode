package org.Pattern.prototype.test;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/11
 * @description
 */
public class Citation  implements Cloneable{
    //三好学生上的姓名
    private  Student sdu;
    //浅拷贝基本类型
    private  String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student getSdu() {
        return sdu;
    }

    public void setSdu(Student sdu) {
        this.sdu = sdu;
    }

    public  void  show(){
        System.out.println(sdu.getName()+"同学:你获得了三好学生");
        System.out.println(sex+"同学:你获得了三好学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
