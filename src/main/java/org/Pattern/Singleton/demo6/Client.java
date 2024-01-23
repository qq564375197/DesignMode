package org.Pattern.Singleton.demo6;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/1
 * @description 使用反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        /*//1.获取singleton字节码对象
        Class  clazz=singleton.class;
        //2.获取无参构造方法
        Constructor cons=clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建singleton对象
        singleton s1 = (singleton)cons.newInstance();
        singleton s2 = (singleton)cons.newInstance();
        System.out.println(s1==s2);//反射条件下如果返回true，没有破坏单例模式，false表明破坏*/
        // writeObjectFile();---序列化会破坏单例模式！！
        readObjectFile();
        readObjectFile();
    }
    //从文件读数据（对象）
    public  static  void  readObjectFile() throws  Exception {
        //1.创建对象输入流对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\a.txt"));
        //2.读取对象
       singleton  instance= (singleton) ois.readObject();
        System.out.println(instance);
        //释放资源
        ois.close();
    }
    //向文件写数据（对象）
    public  static  void  writeObjectFile() throws Exception {
        //1.获取singleton对象
        singleton instance=singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        //3.写对象
        oos.writeObject(instance);
        //4.释放资源
        oos.close();
    }
}
