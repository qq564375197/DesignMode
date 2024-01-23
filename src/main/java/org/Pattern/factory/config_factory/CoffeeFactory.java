package org.Pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/4
 * @description 咖啡工厂类
 */
public class CoffeeFactory   {
    //加载配置文件，获取配置文件中配置的全类名，并创建该类对象
    //1.定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map=new HashMap<>();

    //2.加载配置文件
    static {
        //2.1创建Properties对象
        Properties properties=new Properties();
        //2.2调用properties对象的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            //从p集合中获取全类名名称并创建对象
            Set<Object> keys=properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                //通过反射技术创建
                Class  clazz=Class.forName(className);
                Coffee coffee =(Coffee) clazz.newInstance();
                //将名称和对象存储到容器中
                map.put((String)key,coffee);
            }

        } catch ( Exception e) {
            throw new RuntimeException(e);
        }
    }
    public  static  Coffee creatCoffee(String name){
        return map.get(name);
    }
}
