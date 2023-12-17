package com.leetcode.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithAtLeastKRrepeatingCharacters {
    public class Solution {
        public int longestSubstring(String s, int k) {
            if (s == null || s.length() == 0) return 0;
            Map<Character, Integer> freq = new HashMap<>();
            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            if (freq.values().stream().allMatch(count -> count >= k)) {
                return s.length();
            }

            int rs = 0;
            int i = 0, j = 0;
            int len = s.length();
            while (j < len) {
                if (freq.get(s.charAt(j)) < k) {
                    rs = Math.max(rs, longestSubstring(s.substring(i, j), k));
                    i = j + 1;
                }
                j++;
            }

            rs = Math.max(rs, longestSubstring(s.substring(i), k));
            return rs;
        }
    }
}
