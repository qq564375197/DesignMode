package org.aboutMoreTrick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/3/7
 * @description 描述该类功能
 */
public class AboutArray {
    public static void main(String[] args) {
        twoArray();
    }
    /**
     * leetcode hot:53.最大子数组和
     * */
    public int maxSubArray(int[] nums){
        if (nums.length==0||nums==null){
            return 0;
        }
        int res=Integer.MIN_VALUE;
        int sum=nums[0];
        for (int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            res=Math.max(sum,res);
        }
        return res;
    }
    /**
     * leetcode hot:53.最大子数组和（需要背）
     * */
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length<=1){
            return intervals;
        }
        //排序
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> merg=new ArrayList<>();
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(current[1]>=intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);
            } else{
                merg.add(current);
                current=intervals[i];
            }
        }
        merg.add(current);
        return merg.toArray(new int[merg.size()][]);
    }
    /**
     * 关于二维数组
     * */
    public  static void twoArray(){
        int[][] intArrays=new int[3][2];
        intArrays[0][0]=1;
        intArrays[0][1]=2;
        intArrays[1][0]=2;
        intArrays[1][1]=3;
        intArrays[2][0]=3;
        intArrays[2][1]=4;
        for (int i = 0; i < intArrays.length; i++) {
            int a=intArrays[i][1];
            System.out.println("遍历每行的第2位数字:"+a);
        }
    }
}
