package com.leetcode.week4;

public class IntegerReplacement {
    /*
    If n is even, halve it.
    If n=3 or n-1 has less 1's than n+1, decrement n.
    Otherwise, increment n.
     */
    class Solution {
        public int integerReplacement(int n) {
            int c = 0;
            while (n != 1) {
                if ((n & 1) == 0) {
                    n >>>= 1;
                } else if ((n == 3) || (Integer.bitCount(n - 1) < Integer.bitCount(n + 1))) {
                    --n;
                } else {
                    ++n;
                }
                ++c;
            }
            return c;
        }
    }
}
