package com.aruforce.array;


/**
 * 数学上+1
 * @author Aruforce
 * @see <a href="https://leetcode-cn.com/problems/plus-one/solution/java-shu-xue-jie-ti-by-yhhzw/">leetCode Link</a>
 */
public class Q66 {
    static  int [] data = {9,9,9,9,9};
    public static void main(String[] args) {
        int[] ints = plusOne(data);
        for (int anInt : ints) {
            System.out.print(anInt);
        }

    }
    public static int[] plusOne(int[] digits) {
        boolean flag = false;
        boolean needSpread = false;
        for (int i = digits.length-1; i >=0 ; i--) {
            flag = false;
            if (digits[i]==9){
                digits[i]=0;
                flag = true;
                if (i==0){
                    needSpread = true;
                }
            }else {
                digits[i] = digits[i]+1;
                break;
            }
            if (!flag){
                break;
            }
        }
        if (needSpread){
            int [] data = new int[digits.length+1];
            data[0] =1;
            return data;
        }else {
            return digits;
        }
    }
}
