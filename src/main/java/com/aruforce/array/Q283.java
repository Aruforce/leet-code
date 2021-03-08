package com.aruforce.array;

/**
 * 移零
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">leetCode Link</a>
 */
public class Q283 {

    public static void moveZeroes(int[] nums) {
        int  a  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                if(a!=i){
                    nums[a] = nums[i];
                    nums[i] = 0;
                }
                a++;
            }
        }
    }
}
