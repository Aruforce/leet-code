package com.aruforce.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q136Test {
    @Test
    public void removeDuplicates(){
        int[] a = {2,2,1};
        int i = Q136.singleNumber(a);
        assertEquals(i,2);
    }
}
