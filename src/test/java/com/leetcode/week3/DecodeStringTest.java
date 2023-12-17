package com.leetcode.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    @Test
    public void simpleTest() {
        assertEquals("aaabcbc", (new DecodeString()).new Solution().decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", (new DecodeString()).new Solution().decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", (new DecodeString()).new Solution().decodeString("2[abc]3[cd]ef"));
        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", (new DecodeString()).new Solution().decodeString("10[leetcode]"));
    }
}