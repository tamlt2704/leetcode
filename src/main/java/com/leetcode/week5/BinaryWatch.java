package com.leetcode.week5;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    class Solution {
        public List<String> readBinaryWatch(int turnedOn) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 60; j++) {
                    if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                        result.add(String.format("%d:%02d", i, j));
                    }
                }
            }
            return result;
        }
    }
}
