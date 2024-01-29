package org.aboutMoreTrick;

import java.util.*;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/26
 * @description 关于Hashmap的相关技巧使用
 */
public class AboutMap {
    //解析：
    //Hashmap是java中常用的实现了`map`接口的键值对集合类。本类主要实现一些技巧的方法
    public static void main(String[] args) {
        //解释map<Object,Objcet>  分别对应key类型和value类型
    }
    //map的基本方法
    void MapbaseMethod(HashMap<Integer, Integer> map){
        //添加key,value
        map.put(1,2);
        //根据键获取对应的值 map.get(key)--取到value
        Integer num = map.get(1);
        //判断hashMap中是否包含指定的key---返回值 boolean----map里面的key是唯一的。如果存放相同的key。那么会覆盖value值。
        map.containsKey(1);
        //判断hashMap中是否包含指定的value---返回值 boolean
        map.containsValue(2);
        //获取HashMap中所有键的集合---返回值set
        Set<Integer> integers = map.keySet();
        //获取HashMap中所有的值的集合
        Collection<Integer> values = map.values();
        //获取HashMap中所有的键值对（Entry）集合
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        //根据key移除键值对，
        Integer remove1 = map.remove(1);
        //获取HashMap中键值对的数量。
        map.size();
    }
    //map的使用技巧
    void MapTrick(HashMap<Integer, Integer> map){
        HashMap<Integer, Integer> map2=new HashMap<>();
    //遍历HashMap:使用keySet(),或者entrySet()方法
        for (Integer key : map.keySet()) {
            Integer integer = map.get(key);
            System.out.println(integer);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();

        }
        //合并两个HashMap。可以使用putAll方法--遵循key唯一。相同则覆盖的逻辑
        map.putAll(map2);

    }
    /**
     * leetcode:49.字母异位词分组
     * */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap();
        for (int i = 0; i < strs.length; i++) {
            // 将字符串转换为字符数组，进行排序，再转换为字符串
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            // 如果排序后的字符串不在map中，创建一个新的列表
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // 将原始字符串添加到对应的列表中
            map.get(sortedStr).add(strs[i]);
        }
        // 将map的值转换为列表，得到分组好的异位词列表
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
    /**
     * leetcode:1.两数之和
     * */
    public int[] twonum(int[] nums, int target){
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];   // 遍历当前元素，并在map中寻找是否有匹配的key
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }
            map.put(nums[i], i);    // 如果没找到匹配对，就把访问过的元素和下标加入到map中
        }
        return res;
    }
}
