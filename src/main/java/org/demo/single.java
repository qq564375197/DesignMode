package org.demo;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/15
 * @description 单例模式
 */
public class single {
    private static final single INTANCE=new single();
    private single(){}
    private  static single getInstance(){
        return INTANCE;
    }
}
