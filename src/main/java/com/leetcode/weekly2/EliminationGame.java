package com.leetcode.weekly2;

public class EliminationGame {
    class Solution {
        public int lastRemaining(int n) {
            //System.out.println("n = " + n);
            int head = 1;
            int step = 1;
            boolean leftToRight = true;
            while (n > 1) {
                //System.out.println(n + ":" + step + ":" + leftToRight + ":" + head);
                if (leftToRight) {
                    head += 1 << (step - 1);  // 2 ^ x
                } else {
                    if (n % 2 != 0) {
                        head += 1 << (step - 1);
                    }
                }
                //System.out.println("next head:" + head);

                leftToRight = !leftToRight;
                step++;
                n /= 2;
            }
            return head;
        }
    }
}
