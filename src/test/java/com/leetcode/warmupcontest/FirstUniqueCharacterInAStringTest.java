package com.leetcode.warmupcontest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {
    @Test
    public void simpleTest() {
        assertEquals(0, (new FirstUniqueCharacterInAString()).new Solution().firstUniqChar("leetcode"));
        assertEquals(2, (new FirstUniqueCharacterInAString()).new Solution().firstUniqChar("loveleetcode"));
        assertEquals(-1, (new FirstUniqueCharacterInAString()).new Solution().firstUniqChar("aabb"));
    }
}
