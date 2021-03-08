package com.aruforce.array;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Q217Test {

    @Test
    public void containsDuplicate(){
        int [] nums = { 1,2,3,1};
        boolean b = Q217.containsDuplicate(nums);
        assertTrue(b);
    }
}
