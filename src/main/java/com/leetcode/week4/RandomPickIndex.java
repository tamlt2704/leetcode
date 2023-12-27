package com.leetcode.week4;

import java.util.*;

public class RandomPickIndex {

    class Solution {
        Map<Integer, List<Integer>> numMap = new HashMap<>();
        static Random random = new Random();

        public Solution(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                List<Integer> ids = numMap.getOrDefault(nums[i], new ArrayList<>());
                ids.add(i);
                numMap.put(nums[i], ids);
            }
        }

        public int pick(int target) {
            List<Integer> ids = numMap.get(target);
            return ids.get(random.nextInt(ids.size()));
        }
    }
}
