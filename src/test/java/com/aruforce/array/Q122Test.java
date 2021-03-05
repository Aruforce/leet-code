package com.aruforce.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q122Test {
    @Test
    public void removeDuplicates(){
        int[] a = {7,1,5,3,6,4};
        int i = Q122.maxProfit(a);
        assertEquals(i,7);
    }
}
