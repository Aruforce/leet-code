package com.aruforce.array;

/**
 * 原地删除已排序数组中的重复元素
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/">leetCode Link</a>
 */
public class Q26 {
    public static int removeDuplicates(int[] nums) {
        int target = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[target] != nums[i]) {
                target++;
                nums[target] = nums[i];
            }
        }
        return target+1;
    }
    /**
     * 解题思路
     * 因为是已经排序的数组，那么我们就假定某个index之前的数据全是不同的(比如index=0时)；
     * 我们只需要做的是从 这个index 之后 查找第一个不同的值，并将其付给 index+1 ，
     * 这时 我们就又回到了 原来 index的模式,也就是找index+1 之后的不同的值 付给index+1后的位置。。。如此循环
     *  时间复杂度O(n) 空间复杂度O(1)
     */
}
