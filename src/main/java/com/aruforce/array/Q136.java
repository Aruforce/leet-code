package com.aruforce.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  只出现一次的数字
 *  @author Aruforce
 *  @see <a href="https://leetcode-cn.com/problems/single-number/">leetCode Link</a>
 */
public class Q136 {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> data = new HashMap<>();
        for (int num : nums) {
            Integer integer = data.get(num);
            if (integer==null){
                data.put(num,1);
            }else {
                data.put(num,2);
            }
        }
        AtomicInteger value = new AtomicInteger();
        data.forEach((k,v)->{
            if (v==1){
                value.set(k);
            }
        });
        return value.get();
    }
}
