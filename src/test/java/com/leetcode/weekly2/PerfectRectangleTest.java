package com.leetcode.weekly2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectRectangleTest {
    @Test
    public void simpleTest() {
        int[][] num = {{1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}};
        assertEquals(false, (new PerfectRectangle()).new Solution().isRectangleCover(num));
        int[][] num2 = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
        assertEquals(true, (new PerfectRectangle()).new Solution().isRectangleCover(num2));
        int[][] num3 = {{0, 0, 1, 1}, {0, 0, 2, 1}, {1, 0, 2, 1}, {0, 2, 2, 3}};
        assertEquals(false, (new PerfectRectangle()).new Solution().isRectangleCover(num3));
    }
}