package com.aruforce.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 原地删除已排序数组中的重复元素
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/">leetCode Link</a>
 */
public class Q350 {
    static int [] nums1= {1,2,2,1};
    static int [] nums2= {2,2};
    public static void main(String[] args) {
       int [] a =  intersect2(nums1,nums2);
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static  int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2= 0;
        int MaxLength = nums1.length>nums2.length? nums2.length : nums1.length;
        int [] tmp = new int[MaxLength];
        int tmpIndex =0;
        while (index1<nums1.length&&index2<nums2.length){
            if (nums1[index1] == nums2[index2]){
                tmp[tmpIndex] = nums1[index1];
                tmpIndex++;
                index1++;
                index2++;
            }else if (nums1[index1]>nums2[index2]){
                index2++;
            }else {
                index1++;
            }
        }
        return Arrays.copyOfRange(tmp,0,tmpIndex);
    }
    public static  int[] intersect2(int[] nums1, int[] nums2) {
        int [] hashArray = nums1.length>nums2.length? nums2 : nums1;
        Map<Integer,Integer> hashCounter = new HashMap<Integer,Integer>();
        for (int i : hashArray) {
            if (null == hashCounter.get(i)){
                hashCounter.put(i,1);
            }else {
                Integer integer = hashCounter.get(i);
                int i1 = integer.intValue()+1;
                hashCounter.put(i,i1);
            }
        }
        int maxLength = nums1.length>nums2.length? nums2.length : nums1.length;
        int [] tmp = new int[maxLength];
        int tmpIndex = 0;
        int [] loopArray = nums1.length>nums2.length? nums1 : nums2;
        for (int i : loopArray) {
            Integer integer = hashCounter.get(i);
            if (null != integer&&integer.intValue()>=1){
                tmp[tmpIndex] = i;
                hashCounter.put(i,integer.intValue()-1);
                tmpIndex++;
            }
        }
        return Arrays.copyOfRange(tmp,0,tmpIndex);
    }
}
