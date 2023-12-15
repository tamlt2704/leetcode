package com.leetcode.warmupcontest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestAbsoluteFilePathTest {

    @Test
    public void simpleTest() {
        assertEquals(20, (new LongestAbsoluteFilePath()).new Solution().lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
        assertEquals(16, (new LongestAbsoluteFilePath()).new Solution().lengthLongestPath("dir\n        file.txt"));
        assertEquals(20, (new LongestAbsoluteFilePath()).new Solution().lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
        assertEquals(25, (new LongestAbsoluteFilePath()).new Solution().lengthLongestPath("file name with  space.txt"));
//        System.out.println((new LongestAbsoluteFilePath()).new Solution().lengthLongestPath("file name with  space.txt"));
    }
}