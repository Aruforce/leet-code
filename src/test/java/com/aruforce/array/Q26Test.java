package com.aruforce.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q26Test {
    @Test
    public void removeDuplicates(){
        int[] a = {1, 1, 2};
        int[] a_res = {1, 2, 2};
        int i = Q26.removeDuplicates(a);
        assertEquals(i,2);
        assertArrayEquals(a,a_res);
    }
}
