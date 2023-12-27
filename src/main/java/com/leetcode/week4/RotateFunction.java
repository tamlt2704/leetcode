package com.leetcode.week4;

public class RotateFunction {
    class Solution {
        public int maxRotateFunction(int[] nums) {
            int n = nums.length;
            if (n == 1) return 0;

            int sum = 0;
            int rotSum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                rotSum += i * nums[i];
            }

            int result = rotSum;
            for (int i = 1; i < n; i++) {
                rotSum += sum - n * nums[n - i];
                result = Math.max(result, rotSum);
            }
            return result;
        }
    }
}
