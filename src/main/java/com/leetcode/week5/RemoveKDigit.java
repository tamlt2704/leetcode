package com.leetcode.week5;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveKDigit {
    class Solution {
        public String removeKdigits(String num, int k) {
            String res = "";
            Deque<Character> stack = new LinkedList<>();

            for (char c : num.toCharArray()) {
                while (!stack.isEmpty() && (stack.peekLast() > c) && (k > 0)) {
                    stack.pollLast();
                    k--;
                }
                stack.addLast(c);
            }

            while (k > 0) {
                stack.pollLast();
                k--;
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty() && stack.getFirst() == '0') {
                stack.pollFirst();
            }

            if (stack.isEmpty()) return "0";

            while (!stack.isEmpty()) {
                sb.append(stack.pollFirst());
            }

            return sb.toString();
        }
    }
}
