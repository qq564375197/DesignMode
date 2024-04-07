package org.aboutMoreTrick;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/3/6
 * @description String字符串相关
 */
public class AboutStringnav {
    public static void main(String[] args) {
        reverseWords("a good   example");
//        BigDecimal a= new BigDecimal(0);
//        List<Integer> list=new ArrayList<>();
//        list.add(2000);
//        list.add(2000);
//        list.add(2000);
//        for (int i = 0; i < list.size(); i++) {
//            a=a.add(BigDecimal.valueOf(list.get(i)));
//        }
//        System.out.println(a.add(a).add(a));
    }
    /**
     * 反转字符串中的单词
     * */
    public static String reverseWords(String s) {
        s = s.trim();                                    // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;// 搜索首个空格
            }
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while (i >= 0 && s.charAt(i) == ' ')
            {
                i--;     // 跳过单词间空格
            }
            j = i;                                       // j 指向下个单词的尾字符
        }
        return res.toString().trim();
    }
    /**
     * leetcode hot:3.无重复字符的最长子串
     * */
    public int lengthOfLongestSubstring(String s){
        //字符串的起始位置
        int start=0;
        //最长
        int maxLength=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (map.containsKey(ch)){
                //下一个不重复字符串的起始长度。比如：abcab,(数组起始为0)start=3（a）
                start=Math.max(map.get(ch)+1,start);
            }
            map.put(ch,i);
            maxLength=Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
    /**
     * leetcode hot:560.和为K的子数组
     * */
    public int subarraySum(int[] nums, int k){
        int count=0;
        for (int start=0;start<nums.length;start++){
            int sum=0;
            //求尾数和，枚举所有结果
            for (int end=start;end>=0;end--){
                sum=sum+nums[end];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
