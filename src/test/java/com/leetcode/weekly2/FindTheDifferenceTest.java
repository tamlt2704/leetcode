package com.leetcode.weekly2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {
    @Test
    public void simpleTest() {
        assertEquals('e', (new FindTheDifference()).new Solution().findTheDifference("abcd", "abcde"));
        assertEquals('y', (new FindTheDifference()).new Solution().findTheDifference("", "y"));
    }
}