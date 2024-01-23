package org.example.demo2.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 正方形
 */
public class Square  extends Rectangle{
    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }
    @Override
    public  void  setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }
}
