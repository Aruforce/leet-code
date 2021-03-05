package com.aruforce.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q189Test {
    @Test
    public void rotate(){
        int[] a1 = {1, 2, 3,4,5,6,7};
        int[] a1_res = {6,7,1, 2, 3,4,5};
        Q189.rotate(a1,2);
        assertArrayEquals(a1,a1_res);
        int[] a2 = {1, 2, 3,4,5,6,7};
        Q189.rotate(a2,9);
        assertArrayEquals(a2,a1_res);
    }
}
