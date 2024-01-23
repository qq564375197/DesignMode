package org.example.demo2.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 请写明这个类是干嘛的
 */
public class Rectangle implements Quadrilateral{
    private  double length;

    private  double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

@Override
    public double getLength() {
        return length;
    }

@Override
    public double getWidth() {
        return width;
    }
}
