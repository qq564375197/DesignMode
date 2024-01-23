package org.example.demo2.after;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description 测试类
 */
public class RectangleDemo {
    public static void main(String[] args) {
        org.example.demo2.after.Rectangle
         rectangle= new org.example.demo2.after.Rectangle();
        rectangle.setWidth(19.0);
        rectangle.setLength(20.0);
        resize(rectangle);
        printLW(rectangle);
    }
    //扩宽方法
    public  static  void  resize(Rectangle rectangle){
        //判断宽 如果比长小，进行扩宽的操作
        while (rectangle.getLength()>=rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    //打印长和宽
    public  static  void  printLW(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
