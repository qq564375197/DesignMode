package org.Pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/19
 * @description 订单类
 */
public class Order {
    //餐桌号码
    private int diningTable;
    //所下的产品及份数
    private Map<String,Integer> foodDir= new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,Integer num) {
        foodDir.put(name,num);
    }
}
