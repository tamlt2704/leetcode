package com.leetcode.weekly2;
//https://leetcode.com/contest/leetcode-weekly-contest-2/problems/find-the-difference/
public class FindTheDifference {
    class Solution {
        public char findTheDifference(String s, String t) {
            //return new StringBuilder().append(s).append(t).toString().
            if (s.isEmpty()) return t.charAt(0);
            int c = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                c ^= s.charAt(i);
            }
            for (int i = 0; i < t.length(); i++) {
                c ^= t.charAt(i);
            }
            return (char) c;
        }
    }
}
