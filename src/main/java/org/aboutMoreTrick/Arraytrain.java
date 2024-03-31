package org.aboutMoreTrick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/3/10
 * @description 数组题及相关方法
 */
public class Arraytrain {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        productExceptSelf(nums);
    }
    //轮转数组
    public void lunzhuanArrays(int nums[],int k){
        int n=nums.length;
        int[] newAr=new int[n];
        for(int i=0;i<n;i++){
            newAr[(i+k)%n]=nums[i];
        }
        System.arraycopy(newAr, 0, nums, 0, n);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    //除自身以外数组的乘积
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        //填充自身数组
        Arrays.fill(ans,1);
        //定义一个乘积初始值
        int beforeSum=1;
        int afterSum=1;
        for(int i=0,j=n-1;i<n;i++,j--){
            ans[i]=ans[i]*beforeSum;
            ans[j]=ans[j]*afterSum;
            beforeSum=beforeSum*nums[i];
            afterSum=afterSum*nums[j];
        }
        return ans;
    }
    //多数元素
    public int majorityElement(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
