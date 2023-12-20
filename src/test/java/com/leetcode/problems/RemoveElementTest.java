package com.leetcode.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    public void simpleTest() {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        assertEquals(2, new RemoveElement().new Solution().removeElement(nums, val));

        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5, new RemoveElement().new Solution().removeElement(nums2, 2));

        int[] nums3 = new int[]{3,2,2,3};
        assertEquals(2, new RemoveElement().new Solution().removeElement(nums3, 3));
    }
}