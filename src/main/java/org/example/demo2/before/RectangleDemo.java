package org.example.demo2.before;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/7/26
 * @description demo
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(21.0);
        rectangle.setWidth(20.0);
        //调用resize方法进行扩宽
        resize(rectangle);
        printLW(rectangle);
        System.out.println("--------------");
        //创建正方形对象
        Square square=new Square();
        square.setLength(19.0);
        square.setWidth(19.0);
        resize(square);
        //打印
        printLW(square);
    }
    //扩宽方法
    public  static  void  resize(Rectangle rectangle){
        //判断宽 如果比长小，进行扩宽的操作
        while (rectangle.getLength()>=rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }
    //打印长和宽
    public  static  void  printLW(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
