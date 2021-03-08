package com.aruforce.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两数之和
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/two-sum/">leetCode Link</a>
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numsMap = new HashMap<>(nums.length);
        for(int i =0;i<nums.length;i++){
            List<Integer> indexs = numsMap.get(nums[i]);
            if(null == indexs){
                indexs = new ArrayList<>();
                indexs.add(i);
                numsMap.put(nums[i],indexs);
            }else{
                indexs.add(i);
            }
        }
        for(Integer a1 : numsMap.keySet()){
            Integer a2 = new Integer(target - a1.intValue());
            List<Integer> indexs = numsMap.get(a2);
            if(null!=indexs&&!a1.equals(a2)){
                return new int []{numsMap.get(a1).get(0).intValue(),indexs.get(0).intValue()};
            }
            if(null!=indexs&&a1.equals(a2)&&indexs.size()>=2){
                return new int []{numsMap.get(a1).get(0).intValue(),indexs.get(1).intValue()};
            }
        }
        return null;
    }
}
