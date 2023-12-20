package com.leetcode.problems;

import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            int i = 0;
            int n = nums.length;
            for (int j = 0; j < n; j++) {
                if (nums[j] != val) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                }
            }
            return i;
        }
    }
}
