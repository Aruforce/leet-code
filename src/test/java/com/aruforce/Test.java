package com.aruforce;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int[] ints = Arrays.copyOfRange(a, a.length - 2, a.length);
        int[] ints1 = Arrays.copyOfRange(a,0,a.length-2);
        System.arraycopy(a, 0, a, 2, a.length - 2);
        System.arraycopy(ints, 0, a, 0, 2);
        System.out.println(Arrays.toString(a));
    }
}
