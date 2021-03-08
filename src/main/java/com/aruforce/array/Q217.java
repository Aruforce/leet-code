package com.aruforce.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 原地删除已排序数组中的重复元素
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/contains-duplicate/">leetCode Link</a>
 */
public class Q217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            boolean has =  data.add(nums[i]);
            if(!has){
                return !has;
            }
        }
        return false;
    }
}
