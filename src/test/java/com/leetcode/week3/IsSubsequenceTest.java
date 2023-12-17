package com.leetcode.week3;

import com.leetcode.weekly2.EliminationGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    public void simpleTest() {
        assertEquals(true, (new IsSubsequence()).new Solution().isSubsequence("abc", "ahbgdc"));
        assertEquals(false, (new IsSubsequence()).new Solution().isSubsequence("axc", "ahbgdc"));
    }
}