package org.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/16
 * @description 编写测试的代码
 */
public class test {
    private  static  final  test INSTANCE=new test();
    public test(){
    }
    public static test getInstance(){
        return INSTANCE;
    }

}
