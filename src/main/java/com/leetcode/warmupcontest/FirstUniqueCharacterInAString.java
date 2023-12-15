package com.leetcode.warmupcontest;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/contest/warm-up-contest/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {
    class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> count = new HashMap<>();
            char[] cArr = s.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                count.put(cArr[i], count.getOrDefault(cArr[i], 0) + 1);
            }

            for (int i = 0; i < cArr.length; i++) {
                if (count.get(cArr[i]) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
