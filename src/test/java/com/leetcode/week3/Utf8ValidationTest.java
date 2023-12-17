package com.leetcode.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Utf8ValidationTest {
    @Test
    public void simpleTest() {
        int[] num = {197, 130, 1};
        assertEquals(true, (new Utf8Validation()).new Solution().validUtf8(num));
        int[] num2 = {235, 140, 4};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num2));
        int[] num4 = {255};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num4));
        int[] num5 = {237};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num5));
        int[] num6 = {145};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num6));
        int[] num7 = {240,162,138,147,145};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num7));
        int[] num8 = {230, 136, 145};
        assertEquals(true, (new Utf8Validation()).new Solution().validUtf8(num8));
        int[] num9 = {250, 145, 145, 145, 145};
        assertEquals(false, (new Utf8Validation()).new Solution().validUtf8(num9));
    }
}