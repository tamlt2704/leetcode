package com.leetcode.weekly2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminationGameTest {
    @Test
    public void simpleTest() {
        assertEquals(2, (new EliminationGame()).new Solution().lastRemaining(5));
        assertEquals(4, (new EliminationGame()).new Solution().lastRemaining(6));
        assertEquals(6, (new EliminationGame()).new Solution().lastRemaining(9));
        assertEquals(1, (new EliminationGame()).new Solution().lastRemaining(1));
    }
}