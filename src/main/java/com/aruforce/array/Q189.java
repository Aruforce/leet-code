package com.aruforce.array;

import java.util.*;

/**
 * 原地删除已排序数组中的重复元素
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/rotate-array/">leetCode Link</a>
 */
public class Q189 {
    /**
     * 解题思路
     *  1.不能真的移动K次， 真移动K次也行 时间会炸
     *  2. 想一想的话  长度5的数组 右移6次 和右移1一次 结果不是一样的么
     */
    public static void rotate(int[] nums, int k) {
        int true_move = k% nums.length;
        if(true_move !=0 ){
            int[] ints = Arrays.copyOfRange(nums, nums.length - true_move, nums.length);
            System.arraycopy(nums, 0, nums, true_move, nums.length - true_move); //移动
            System.arraycopy(ints, 0, nums, 0, true_move);
        }
    }

}
