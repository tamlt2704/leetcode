package com.leetcode.week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigitTest {
    @Test
    public void simpleTest() {
        assertEquals("1219", (new RemoveKDigit()).new Solution().removeKdigits("1432219", 3));
        assertEquals("200", (new RemoveKDigit()).new Solution().removeKdigits("10200", 1));
        assertEquals("11", (new RemoveKDigit()).new Solution().removeKdigits("112", 1));
    }
}