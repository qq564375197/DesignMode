package org.example.demo2.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 正方形
 */
public class Square  implements Quadrilateral{
    private  double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
