package com.leetcode.week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtLeastKRrepeatingCharactersTest {
    @Test
    public void simpleTest() {
//        assertEquals(3, (new LongestSubstringWithAtLeastKRrepeatingCharacters()).new Solution().longestSubstring( "aaabb", 3));
//        assertEquals(5, (new LongestSubstringWithAtLeastKRrepeatingCharacters()).new Solution().longestSubstring( "ababbc", 2));
        assertEquals(3, (new LongestSubstringWithAtLeastKRrepeatingCharacters()).new Solution().longestSubstring( "bbaaacbd", 3));
        //System.out.println(Arrays.toString("ababbc".split("a")));
    }
}