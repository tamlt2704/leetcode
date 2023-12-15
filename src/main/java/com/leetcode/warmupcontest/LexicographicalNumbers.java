package com.leetcode.warmupcontest;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/contest/warm-up-contest/problems/lexicographical-numbers/
public class LexicographicalNumbers {
    class Solution {
        List<Integer> rs = new ArrayList<>();
        public void add(int i, int n) {
            if (i > n) {
                return;
            }
            rs.add(i);

            add(i * 10, n);
            if (i % 10 != 9) {
                add(i + 1, n);
            }
        }

        public List<Integer> lexicalOrder(int n) {
            add(1, n);
            return rs;
        }
    }
}
