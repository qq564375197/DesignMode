package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ayin
 * @verison 1.0
 * @date $DATE
 * @description 请写明这个类是干嘛的
 */
public class Main {
    public static void main(String[] args) {
            int[] a=new int[5];
            a[0]=1;
            a[1]=1;
            a[2]=0;
            a[3]=12;
            a[4]=3;
            moveZeroes(a);
    }
    public  static  void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
